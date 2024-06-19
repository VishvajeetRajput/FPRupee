FROM openjdk:11
COPY target/erupi.jar erupi.jar
ENTRYPOINT ["java","-jar","/erupi.jar"]




