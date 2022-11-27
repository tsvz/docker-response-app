FROM openjdk:17
EXPOSE 8000
ADD target/docker-response-app-0.0.1-SNAPSHOT.jar docker-response-app-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "docker-response-app-0.0.1-SNAPSHOT.jar"]