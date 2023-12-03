FROM openjdk:17-jdk-alpine3.14
MAINTAINER Ramkumar
COPY target/ivr-audio-0.0.1.jar ivr-audio-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/ivr-audio-0.0.1.jar"]