FROM openjdk
# CMD ["mvn clean install"]
COPY target/app.jar .
ENTRYPOINT ["java","-jar","/app.jar"]
# EXPOSE 8080
# CMD ["java","-jar","app.jar"]