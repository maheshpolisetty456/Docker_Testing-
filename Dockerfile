FROM amazoncorretto:22

LABEL version="1.0"

EXPOSE 8085:8085

WORKDIR /app

COPY target/Docker_image-0.0.1-SNAPSHOT.jar /app/Docker_image.jar

ENTRYPOINT [ "java","-jar", "Docker_image.jar"]
