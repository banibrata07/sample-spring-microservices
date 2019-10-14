FROM openjdk:8
WORKDIR /
MAINTAINER banibrataaws@gmail.com
ADD discovery-service.jar discovery-service.jar
ENTRYPOINT ["java", "-jar","-Dspring-boot.run.profiles=peer1", "/discovery-service.jar"]
ENTRYPOINT
EXPOSE 8761
