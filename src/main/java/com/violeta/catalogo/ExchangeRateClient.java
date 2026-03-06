package com.violeta.catalogo;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExchangeRateClient {

    private static final String API_KEY = System.getenv("EXCHANGE_API_KEY");
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    private final HttpClient client;

    public ExchangeRateClient() {
        this.client = HttpClient.newHttpClient();
    }

    public double obtenerTasa(String base, String destino) throws Exception {
        String url = BASE_URL + API_KEY + "/pair/" + base + "/" + destino;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
        return json.get("conversion_rate").getAsDouble();
    }

}
