FROM adoptopenjdk/openjdk11:alpine
MAINTAINER baeldung.com
COPY target/ms-unidade-1.jar ms-unidade.jar
ENTRYPOINT ["java","-jar","/ms-unidade.jar"]