FROM openjdk:8
EXPOSE 8080
ADD target/git-actions-cicd.jar git-actions-cicd.jar
ENTRYPOINT ["java","-jar","/git-actions-cicd.jar"]