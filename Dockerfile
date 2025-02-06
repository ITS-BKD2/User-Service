FROM eclipse-temurin:21.0.6_7-jre-ubi9-minimal
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]