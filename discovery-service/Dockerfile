FROM openjdk:8
WORKDIR /
MAINTAINER banibrataaws@gmail.com
ADD discovery-service.jar discovery-service.jar
ENTRYPOINT ["java", "-Dspring-boot.run.profiles=peer1", "-jar", "/discovery-service.jar"]
EXPOSE 8761
