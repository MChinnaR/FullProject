# Use an official OpenJDK runtime as a base image
FROM openjdk:17-jre-slim

# Set the working directory in the container
WORKDIR /usr/src/app

# Copy the application JAR file into the container at the specified working directory
COPY myapp.jar .

# Specify the command to run on container startup
CMD ["java", "-jar", "myapp.jar"]
