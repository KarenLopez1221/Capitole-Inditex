## Capitole-Inditex

## Running application

mvn spring-boot:run

## Tecnologias

Lenguaje y framework

 *Java 8
 *Spring Boot 
 
Gestor de dependencias

 *Maven wrapper
 
Base de datos

 *H2
 *Flyway

Versionamiento de codigo

 *Git
 *GitHub

Entorno de desarrollo

 *Visual Studio Code
 *IntellijIdea

Pruebas de api

 *Postman

Test

 *JUnit
 *Mockito
 
## Entregable

Repositorio publico Github: https://github.com/KarenLopez1221/Capitole-Inditex/blob/main/README.md

## Curl
curl --location --request GET 'http://localhost:8080/V1/Inditex/getPrices?applicationDate=2020-06-16T21:00:00&productId=35455&brandId=1'

## Json de salida

```json
{
    "productId": 35455,
    "brandId": "ZARA",
    "priceList": 1,
    "applicationDates": "2020-06-14T00:00-2020-12-31T23:59:59",
    "price": 35.5
}
```


 
