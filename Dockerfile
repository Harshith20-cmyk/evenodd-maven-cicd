FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -B clean package -DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/target/evenodd-app-1.0.0.jar /app/evenodd.jar
ENTRYPOINT ["java", "-jar", "/app/evenodd.jar"]
CMD ["8"]
