FROM pallet/ubuntu-nodoc
RUN DEBIAN_FRONTEND=noninteractive apt-get install -y --no-install-recommends openjdk-7-jre-headless
RUN apt-get -y autoremove 
RUN apt-get -y autoclean 
RUN apt-get -y clean
ADD http/target/scala-2.11/oescript-http-assembly-* /opt/oescript/bin/

