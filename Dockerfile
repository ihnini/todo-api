FROM openjdk:17
COPY ./build/libs/todo-api-0.0.1-SNAPSHOT.jar /usr/src/app.jar
WORKDIR /usr/src
EXPOSE 8080/tcp
CMD ["java","-jar", "app.jar"]
