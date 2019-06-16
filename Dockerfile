FROM maven:3.6.0-jdk-8 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM java:8
COPY --from=build /home/app/target/spring-boot-example-0.0.1-SNAPSHOT.jar /usr/local/lib/spring-boot-example-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","/usr/local/lib/spring-boot-example-0.0.1-SNAPSHOT.jar"]
