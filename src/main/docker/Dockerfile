FROM java:8
MAINTAINER Dipesh Rane
EXPOSE 8888
ENV JAVA_OPTS -Xmx1024m -XX:MaxPermSize=128M -Djava.security.egd=file:/dev/./urandom
VOLUME /tmp

ADD rubixwebservices-1.0.0.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Xdebug", "-Djava.io.tmpdir=/tmp" ,"-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5050","-jar","/app.jar"]
