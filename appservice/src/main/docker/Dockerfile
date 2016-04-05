FROM scratch
ADD c7-docker.tar.xz /
COPY /jre /opt/hpmc_3rd_party/jre1.7.0
ENV JAVA_HOME /opt/hpmc_3rd_party/jre1.7.0/
COPY appservice-1.0-SNAPSHOT.jar /tmp/appservice-1.0-SNAPSHOT.jar
COPY start.sh /tmp/start.sh
PATH="$PATH:/opt/hpmc_3rd_party/jre1.7.0/bin"
EXPOSE 8080 8443 8000
CMD /opt/hpmc_3rd_party/jre1.7.0/bin/java.exe -jar /tmp/appservice-1.0-SNAPSHOT.jar && tail -F /tmp/service.log