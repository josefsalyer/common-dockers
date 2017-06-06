FROM websphere-liberty:webProfile7
COPY server.xml /opt/ibm/wlp/usr/servers/defaultServer/
COPY TestDB.war /opt/ibm/wlp/usr/servers/defaultServer/dropins/
COPY ../dynatrace-agent-6.3.0.1305-unix.jar /opt/
RUN java -jar /opt/dynatrace-agent-6.3.0.1305-unix.jar
COPY db2jcc4.jar /
COPY jdbc_LI_en /
