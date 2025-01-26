# Build stage
FROM gradle:8.11.1 as build
COPY . /app
WORKDIR /app
RUN gradle build --no-daemon

# Package stage
FROM openjdk:21-jdk
COPY --from=build /app/build/libs/MyMovies-1.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]