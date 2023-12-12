#
# Build stage
#
FROM openjdk:17-jdk-slim AS build
COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN chmod +x mvnw
RUN ./mvnw dependency:resolve
COPY src src
RUN ./mvnw clean package

#
# Package stage
#
FROM openjdk:17-jdk-slim
COPY --from=build /target/cv-0.0.1-SNAPSHOT.jar cv.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]