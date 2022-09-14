#FROM adoptopenjdk/openjdk11
FROM adoptopenjdk/openjdk11:aarch64-ubuntu-jdk-11.0.16.1_1-slim
EXPOSE 8888/tcp
ARG JAR_FILE=target/*.jar
WORKDIR /usr/local/runme

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]

HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://localhost:8888/actuator/health || exit 1

