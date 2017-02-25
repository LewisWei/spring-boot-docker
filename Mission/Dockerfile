FROM java:8
VOLUME /tmp
ADD target/mission-1.0.jar app.jar
RUN bash -c "touch /app.ar"
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb/micros","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]