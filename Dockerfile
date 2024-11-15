FROM openjdk:17
LABEL author="rain"
VOLUME [ "/tmp" ]
COPY eureka-0.0.1-SNAPSHOT.jar /eureka.jar
EXPOSE 1000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka.jar"]
