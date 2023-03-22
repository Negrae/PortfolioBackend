FROM amazoncorretto:17
MAINTAINER Negrae
COPY target/negraeportfolio-0.0.1-SNAPSHOT.jar negraeportfolio-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/negraeportfolio-0.0.1-SNAPSHOT.jar"]