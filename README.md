# conversor-de-monedas
crear un menu con conversor de monedas 
# Convertor de Monedas

Aplicación de consola en Java que permite convertir entre distintas monedas usando la API de [ExchangeRate](https://www.exchangerate-api.com/).

## Funcionalidades

- Conversión entre:
  - Dólar (USD) ↔ Peso Argentino (ARS)
  - Dólar (USD) ↔ Real Brasileño (BRL)
  - Dólar (USD) ↔ Peso Colombiano (COP)
- Consulta de tasas de cambio en tiempo real
- Entrada de monto personalizada por el usuario
- Interfaz de texto amigable

## Requisitos

- Java 11 o superior
- Conexión a internet
- Clave de API de ExchangeRate+
- gson para la creacion de json

estructura del proyecto 
src/
└── com/
    └── violeta/
        └── catalogo/
            ├── Main.java
            └── ExchangeRateClient.java

Autor

Creado por Violett como proyecto de práctica en Java.

