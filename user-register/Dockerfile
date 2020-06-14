# Emart Dockerfile for emart-buyer-service

# Add Maintainer Info
MAINTAINER Pan

# Set Env
ENV TZ Asia/Chengdu

# The application's jar file
ARG JAR_FILE=target/user-register-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} app.jar

# Run the jar file
 ENTRYPOINT ["java","-jar","/app.jar"]