# consumer dockerfile

FROM centos:centos7
MAINTAINER jane

RUN export http_proxy=http://web-proxy.il.hpecorp.net:8088/ && \
export https_proxy=http://web-proxy.il.hpecorp.net:8088/ && \
yum update -y && \
yum install -y wget && \
yum install -y java-1.7.0-openjdk java-1.7.0-openjdk-devel && \
yum clean all

VOLUME /tmp
ADD ../../target/client-1.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
# ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
ENTRYPOINT ["java","-jar","/app.jar"]