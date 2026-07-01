# 🔌 POC HTTP Rest 🇧🇷

![Java](https://img.shields.io/badge/Java-8-009C3B?style=flat&logo=openjdk&logoColor=white)
![Rest Assured](https://img.shields.io/badge/Rest%20Assured-4.0-FFDF00?style=flat&logoColor=black)
![Maven](https://img.shields.io/badge/Maven-002776?style=flat&logo=apachemaven&logoColor=white)

Prova de conceito (POC) de chamadas HTTP GET e POST em Java usando Rest Assured e Commons HttpClient.

## Visao geral

Projeto de estudo com 3 classes demonstrando diferentes formas de fazer chamadas HTTP em Java:

- **GetRestAssured** — chamada GET usando Rest Assured (`RestAssured.request(Method.GET, url)`)
- **HttpCall** — chamada POST usando Apache Commons HttpClient com NameValuePair
- **HttpCallTest** — classe main que executa o HttpCall

## Tecnologias

- **Java 8**
- **Rest Assured 4.0.0**
- **Apache Commons HttpClient 3.1**
- **Maven**

## Como executar

```bash
mvn compile exec:java -Dexec.mainClass="pocHttpRest.GetRestAssured"
mvn compile exec:java -Dexec.mainClass="pocHttpRest.HttpCallTest"
```

## Licenca

Uso interno/educacional.

---
*Feito com 💚💛💙 — cores da bandeira do Brasil 🇧🇷*
