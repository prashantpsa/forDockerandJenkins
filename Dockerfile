FROM openjdk:17

COPY target/dockerExample.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "dockerExample.jar"]