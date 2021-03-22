FROM openjdk:8
ADD target/docker-intrgration.jar docker-intrgration.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","docker-intrgration.jar"]