FROM adoptopenjdk/openjdk11:alpine

COPY target/ms-unidade-1.jar ms-unidade.jar
ENTRYPOINT ["java","-jar","/ms-unidade.jar"]

EXPOSE 8070