FROM openjdk:21
WORKDIR /app
EXPOSE 8080:9090
COPY ./target/myproject-0.0.1-SNAPSHOT.jar app.jar
CMD ["java","-jar","app.jar"]