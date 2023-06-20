FROM openjdk:17-jdk-slim-buster
WORKDIR /opt/app
COPY target/FraudeService-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
