FROM openjdk:8-jre-alpine

Expose 80

ADD target/movie-info-service-0.0.1-SNAPSHOT.jar .

ENTRYPOINT ["java","-jar","movie-info-service-0.0.1-SNAPSHOT.jar"]
