# 1. Build
FROM maven:3.6-jdk-11 AS build
WORKDIR /app
COPY . /app
RUN mvn clean install

# 2. Deploy Java war
FROM adoptopenjdk/openjdk11:jre-11.0.4_11-alpine
WORKDIR /app
COPY --from=build /app/server/target/example-logging-server-bootified.war /app/
ENTRYPOINT ["java","-jar","/app/example-logging-server-bootified.war"]
EXPOSE 8081
