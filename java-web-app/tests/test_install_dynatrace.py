import pytest

VERSION='6.3.0'
BUILD='1305'
AGENT_GROUP='dtgroup'
COLLECTOR='dtcollector'

@pytest.mark.docker_images("dcri/liberty-app:latest")
def test_agent_file_downloaded(host):
  file = host.file(f'/opt/dynatrace-agent-{VERSION}.{BUILD}-unix.jar')
  assert file.exists

def test_java_options(host):
  file = host.file('/opt/ibm/wlp/usr/servers/defaultServer/jvm.options')
  assert file.exists
  assert file.contains(f'-agentpath:/opt/dynatrace-6.3/agent/lib64/libdtagent.so=name={AGENT_GROUP},collector={COLLECTOR}')

