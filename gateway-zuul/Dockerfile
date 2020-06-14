FROM java:8-jdk-alpine
COPY ./target/gateway-zuul-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch gateway-zuul-0.0.1.jar'
ENTRYPOINT ["java", "-jar", "gateway-zuul-0.0.1.jar"]
