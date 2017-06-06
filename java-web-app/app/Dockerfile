FROM websphere-liberty:webProfile7
COPY server.xml /opt/ibm/wlp/usr/servers/defaultServer/
COPY TestDB.war /opt/ibm/wlp/usr/servers/defaultServer/dropins/
COPY download_dynatrace_agent.sh /opt/
RUN /opt/download_dynatrace_agent.sh
COPY db2jcc4.jar /
COPY jdbc_LI_en /
