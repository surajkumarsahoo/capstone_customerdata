FROM tomcat:8.0
MAINTAINER Amit
COPY target/bankdata-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/
