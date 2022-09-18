FROM openjdk:11-slim

LABEL version="1.0.0"
LABEL description="ocnfiguration server for skillabb ms practice"
LABEL copyright="skillabb.com"

EXPOSE ${CONFIG_SERVER_PORT}
ARG JAR_FILE=target/*.jar
WORKDIR /usr/local/runme

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]

HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://localhost:${CONFIG_SERVER_PORT}/actuator/health || exit 1
