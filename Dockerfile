# docker build -t springbootapp .
# docker run -t springbootapp
FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/test-a-manetta.jar test-a-manetta.jar
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/test-a-manetta.jar"]
EXPOSE 9006:9006