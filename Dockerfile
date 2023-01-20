FROM openjdk:17
EXPOSE 8080
ADD target/github-demo.jar github-demo.jar
ENTRYPOINT ["java","-jar","/github-demo.jar"]