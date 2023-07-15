FROM openjdk:17
EXPOSE 8888
ADD ./target/Evidencia-31-0.0.1-SNAPSHOT.jar ms-aula.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=docker","/ms-aula.jar"]