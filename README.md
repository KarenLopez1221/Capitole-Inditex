# Prueba Capitole-Inditex
Karen Yulieth Lopez Medina
*****************************************************************************************************************************************************************

## Running application

mvn spring-boot:run

## Tecnologias

Lenguaje y framework

 1. Java 8
 2. Spring Boot 
 
Gestor de dependencias

 1. Maven wrapper
 
Base de datos

 1. H2
 2. Flyway

Versionamiento de codigo

 1. Git
 2. GitHub

Entorno de desarrollo

 1. Visual Studio Code
 2. IntellijIdea

Pruebas de api

 1. Postman

Test

 1. JUnit
 2. Mockito
 
## Entregable

Repositorio publico Github: https://github.com/KarenLopez1221/Capitole-Inditex/blob/main/README.md

## Curl
```json
curl --location --request GET 'http://localhost:8080/V1/Inditex/getPrices?applicationDate=2020-06-16T21:00:00&productId=35455&brandId=1'
```

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


 
