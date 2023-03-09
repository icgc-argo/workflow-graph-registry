@Library(value='jenkins-pipeline-library@master', changelog=false) _
pipelineRDPCWorkflowGraphRegistry(
    buildImage: "adoptopenjdk/openjdk11:jdk-11.0.7_10-alpine-slim",
    dockerRegistry: "ghcr.io",
    dockerRepo: "icgc-argo/workflow-graph-registry",
    gitRepo: "icgc-argo/workflow-graph-registry",
    testCommand: "./mvnw test -ntp"
)
