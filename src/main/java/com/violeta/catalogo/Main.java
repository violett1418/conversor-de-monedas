package com.violeta.catalogo;

import com.violeta.catalogo.ExchangeRateClient;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.JsonObject;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExchangeRateClient exchangeClient = new ExchangeRateClient();

        int opcion;

        System.out.println("Sea bienvenido/a al conversor de moneda =] " );


        System.out.println("-----------------------------");

        do{

            System.out.println("Menu de opciones:");
            System.out.println("1.  Dolar =>> Peso Argentino");
            System.out.println("2. Peso Argentino =>> Dolar");
            System.out.println("3. Dolar =>> Real Brasileño");
            System.out.println("4. Real Brasileño =>> Dolar");
            System.out.println("5. Dolar  =>> Peso Colombiano");
            System.out.println("6. Peso Colombiano =>> Dolar");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Ingresa el monto en USD: ");
                        double monto = scanner.nextDouble();
                        double tasa = exchangeClient.obtenerTasa("USD", "ARS");
                        double convertido = monto * tasa;
                        System.out.printf("%.2f USD equivale a %.2f Pesos Argentinos%n", monto, convertido);
                    } catch (Exception e) {
                        System.out.println("Error al consultar la tasa: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Ingresa el monto en ARS: ");
                        double monto = scanner.nextDouble();
                        double tasa = exchangeClient.obtenerTasa("ARS", "USD");
                        double convertido = monto * tasa;
                        System.out.printf("%.2f ARS equivale a %.2f USD%n", monto, convertido);
                    } catch (Exception e) {
                        System.out.println("Error al consultar la tasa: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Ingresa el monto en USD: ");
                        double monto = scanner.nextDouble();
                        double tasa = exchangeClient.obtenerTasa("USD", "BRL");
                        double convertido = monto * tasa;
                        System.out.printf("%.2f USD equivale a %.2f Reales Brasileños%n", monto, convertido);
                    } catch (Exception e) {
                        System.out.println("Error al consultar la tasa: " + e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        System.out.print("Ingresa el monto en BRL: ");
                        double monto = scanner.nextDouble();
                        double tasa = exchangeClient.obtenerTasa("BRL", "USD");
                        double convertido = monto * tasa;
                        System.out.printf("%.2f BRL equivale a %.2f USD%n", monto, convertido);
                    } catch (Exception e) {
                        System.out.println("Error al consultar la tasa: " + e.getMessage());
                    }
                    break;

                case 5:
                    try {
                        System.out.print("Ingresa el monto en USD: ");
                        double monto = scanner.nextDouble();
                        double tasa = exchangeClient.obtenerTasa("USD", "COP");
                        double convertido = monto * tasa;
                        System.out.printf("%.2f USD equivale a %.2f Pesos Colombianos%n", monto, convertido);
                    } catch (Exception e) {
                        System.out.println("Error al consultar la tasa: " + e.getMessage());
                    }
                    break;

                case 6:
                    try {
                        System.out.print("Ingresa el monto en COP: ");
                        double monto = scanner.nextDouble();
                        double tasa = exchangeClient.obtenerTasa("COP", "USD");
                        double convertido = monto * tasa;
                        System.out.printf("%.2f COP equivale a %.2f USD%n", monto, convertido);
                    } catch (Exception e) {
                        System.out.println("Error al consultar la tasa: " + e.getMessage());
                    }
                    break;

                case  7:
                    System.out.println(" Esperemos que le haya gustado nuestro servicio,  regrese pronto " );
                    break;

                default:
                    System.out.println("Opción no válida, vuelve a intentarlo");
                    break;
            }
        }while (opcion != 7);
        scanner.close();

    }
}