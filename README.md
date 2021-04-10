<h1 align="center">SpringBoot + Kafka + Docker</h1>

<p align="center">Criação de um ambiente composto por dois Microserviços, Kafka e um Banco de dados PostgreSQL, tudo isso a parte de um arquivo Dockerfile</p>

<!--ts-->
   * [Sobre](#Sobre)
   * [Tabela de Conteudo](#tabela-de-conteudo)
   * [Instalação](#instalacao)
   * [Como usar](#como-usar)
      * [Pre Requisitos](#pre-requisitos)
      * [Local files](#local-files)
      * [Remote files](#remote-files)
      * [Multiple files](#multiple-files)
      * [Combo](#combo)
   * [Tests](#testes)
   * [Tecnologias](#tecnologias)
<!--te-->

<h4 align="center"> 
	Projeto concluido.
</h4>

### Features

- [x] Criação de tabelas automatizadas por um arquivo sql.
- [x] Criação de um microsserviço produtor.
- [x] Criação de um microsserviço consumidor.
- [x] Criação de um serviço de mensageria.
- [x] Gerenciamento do ambiente atraves do Docker Compose.

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [Docker](https://www.docker.com/) e [Docker](https://docs.docker.com/compose/install/). 
Caso exita interesse em adicionar uma nova funcionalidade nos microserviços, então tambem será necessario alguma IDE como [IntelliJ](https://www.jetbrains.com/pt-br/idea/) ou [Eclipse](https://www.eclipse.org/downloads/packages/release/oxygen/3a/eclipse-ide-java-developers).

### 🎲 Iniciando o ambiente a partir do arquivo Dockerfile.

```bash
# Clone este repositório
$ git clone https://github.com/leonardodantas/spring-kafka-docker.git

# Acesse a pasta do projeto e execute o seguinte comando em um terminal qualquer
$ docker-compose up

# Caso prefira executar o docker compose no modo detached 
$ docker-compose up -d

# Apos a execução de um dos comandos acima os serviços serão executados e as seguintes portas serão utilizadas:
- Microsserviço produtor na porta: 8083
- Microsserviço produtor na porta: 8084
- PGAdmin: 16543
```
### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [PostgreSQL](https://www.postgresql.org/)
- [Java](https://www.java.com/pt-BR/)
- [SpringBoot](https://spring.io/projects/spring-boot)
- [Kafka](https://kafka.apache.org/)
- [Docker](https://www.docker.com/)

### Autor
Criado por Leonardo Rodrigues Dantas. Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Thiago-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/tgmarinho/)](https://www.linkedin.com/in/tgmarinho/) 
[![Gmail Badge](https://img.shields.io/badge/-tgmarinho@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:tgmarinho@gmail.com)](mailto:tgmarinho@gmail.com)
