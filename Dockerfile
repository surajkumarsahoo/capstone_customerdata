FROM tomcat:9.0
MAINTAINER Suraj
COPY codingchallenegejan8/bankdata/target/bankdata-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/
