FROM openjdk:17
COPY target/FirstJavaApp.jar FirstJavaApp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "FirstJavaApp.jar"]