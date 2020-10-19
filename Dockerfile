FROM openjdk:latest

ADD target/user-0.0.1-SNAPSHOT.jar user.jar

ENTRYPOINT ["java","-jar","user.jar"]

EXPOSE 8081