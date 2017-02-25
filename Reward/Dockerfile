FROM java:8
VOLUME /tmp
ADD target/reward-1.0.jar app.jar
RUN bash -c "touch /app.jar"
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb/micros","-Djava.security.egd=file://dev/./urandom","-jar","/app.jar"]