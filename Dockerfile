# Mvn Specific
# ---- Builder ----
FROM maven:3.6-jdk-8-alpine AS builder
WORKDIR /app
COPY pom.xml .
RUN mvn -e -B dependency:resolve 
COPY src ./src
RUN mvn -e -B package

# Java Specific
# ---- Runner ----
FROM openjdk:8-jre-alpine
COPY --from=builder /app/target/hawk-0.0.1.jar /hawk.jar
CMD ["java", "-jar", "/hawk.jar"]