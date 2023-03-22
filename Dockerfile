FROM amazoncorretto:11-alpine-jdk
MAINTAINER Negrae
COPY target/negraeportfolio-0.0.1-SNAPSHOT.jar negraeportfolio-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/negraeportfolio-0.0.1-SNAPSHOT.jar"]