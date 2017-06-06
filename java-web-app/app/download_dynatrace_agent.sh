#!/usr/bin/env bash

VERSION=6.3.0
BUILD=1305
AGENT_GROUP=${DYNATRACE_GROUP:-dtgroup}
COLLECTOR=${DYNATRACE_COLLECTOR:-dtcollector}
OUTFILE=/opt/ibm/wlp/usr/servers/defaultServer/jvm.options

wget https://files.dynatrace.com/downloads/OnPrem/dynaTrace/${VERSION}/${VERSION}.${BUILD}/dynatrace-agent-${VERSION}.${BUILD}-unix.jar \
  -O /opt/dynatrace-agent-${VERSION}.${BUILD}-unix.jar
java -jar /opt/dynatrace-agent-${VERSION}.${BUILD}-unix.jar -y

# set the java options
cat << EOF
-agentpath:/opt/dynatrace-6.3/agent/lib64/libdtagent.so=name=${AGENT_GROUP},collector=${COLLECTOR}
EOF > $OUTFILE
