FROM amazoncorretto:17
MAINTAINER Negrae
COPY target/negraeportfolio-0.0.1-SNAPSHOT.jar negraeportfolio-0.0.1-SNAPSHOT.jar EXPOSE 8080
ENTRYPOINT ["java","-jar","/negraeportfolio-0.0.1-SNAPSHOT.jar"]
