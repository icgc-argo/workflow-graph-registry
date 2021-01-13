# workflow-graph-registry

AVRO Schema Registry for Workflow Graph

## Description

AVRO Schema registry built with Spring Cloud Schema Registry.

## Why

Robust automation of running workflows necessitates the elimination of as many "runtime" errors as possible. This is not only to eliminate the potential waste of compute resources but also to make it easier to reason about errors that do arise.

One such error that we can avoid at runtime, is the the error of incorrect inputs being passed to a scheduled workflow. We can accomplish this through the use of schemas, validating the input parameters based on the workflow they are meant for. This way, we can capture these errors before a workflow is ever scheduled.

Given our need to version workflows and their schemas, as well as our reliance on technologies like kafka and rabbitmq, we have settled on AVRO schemas as our solution for this problem.

## Technologies

- AVRO
- Java 11
- Spring Boot
- Spring Cloud Schema Registry
- Postgresql

## Build

This application is built with maven.

```bash
./mvnw clean package
```

## Run

Run with maven:

```bash
./mvnw spring-boot:run
```

Run the uber jar directly:

```shell
java -jar target/workflow-graph-registry-0.0.1-SNAPSHOT.jar
```
