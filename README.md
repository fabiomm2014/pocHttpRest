<h1 align="center">🔌 POC HTTP Rest 🇧🇷</h1>

<p align="center">
  <b>Prova de conceito de chamadas HTTP GET e POST em Java.</b><br>
  Demonstra o uso de Rest Assured e Apache Commons HttpClient
  para consumir APIs REST.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-8-009C3B?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 8">
  <img src="https://img.shields.io/badge/Rest%20Assured-4.0-FFDF00?style=for-the-badge&logoColor=black" alt="Rest Assured">
  <img src="https://img.shields.io/badge/Maven-002776?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven">
</p>

<p align="center">
  <img src="https://img.shields.io/badge/-009C3B?style=flat-square&color=009C3B" height="6" width="120" alt="">
  <img src="https://img.shields.io/badge/-FFDF00?style=flat-square&color=FFDF00" height="6" width="120" alt="">
  <img src="https://img.shields.io/badge/-002776?style=flat-square&color=002776" height="6" width="120" alt="">
</p>

---

## 📑 Sumário

- [🔎 Visão geral](#-visão-geral)
- [🛠️ Tecnologias](#️-tecnologias)
- [🗂️ Estrutura](#️-estrutura)
- [🚀 Como executar](#-como-executar)
- [📄 Licença](#-licença)

---

## 🔎 Visão geral

Projeto de estudo com **3 classes** demonstrando diferentes formas de fazer chamadas HTTP em Java:

| Classe | Descrição |
| :----- | :-------- |
| 📡 **GetRestAssured** | Chamada GET usando `RestAssured.request(Method.GET, url)` |
| 📮 **HttpCall** | Chamada POST usando Apache Commons HttpClient com `NameValuePair` |
| ▶️ **HttpCallTest** | Classe `main` que executa o `HttpCall` |

---

## 🛠️ Tecnologias

| Camada | Tecnologia |
| :----- | :--------- |
| 💻 **Linguagem** | Java 8 |
| 📡 **HTTP (GET)** | Rest Assured 4.0.0 |
| 📮 **HTTP (POST)** | Apache Commons HttpClient 3.1 |
| 🔧 **Build** | Maven |

---

## 🗂️ Estrutura

```text
pocHttpRest/
├── pom.xml
└── src/
    └── pocHttpRest/
        ├── GetRestAssured.java   # GET com Rest Assured
        ├── HttpCall.java         # POST com Commons HttpClient
        └── HttpCallTest.java     # Main — executa HttpCall
```

---

## 🚀 Como executar

<details open>
<summary><b>▶️ Executar classes</b></summary>

```bash
mvn compile exec:java -Dexec.mainClass="pocHttpRest.GetRestAssured"
mvn compile exec:java -Dexec.mainClass="pocHttpRest.HttpCallTest"
```

</details>

---

## 📄 Licença

Projeto de uso interno/educacional.

<p align="center">
  <img src="https://img.shields.io/badge/-009C3B?style=flat-square&color=009C3B" height="6" width="120" alt="">
  <img src="https://img.shields.io/badge/-FFDF00?style=flat-square&color=FFDF00" height="6" width="120" alt="">
  <img src="https://img.shields.io/badge/-002776?style=flat-square&color=002776" height="6" width="120" alt="">
</p>

<p align="center"><sub>Feito com 💚💛💙 — cores da bandeira do Brasil 🇧🇷</sub></p>
