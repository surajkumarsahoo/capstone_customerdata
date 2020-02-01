FROM tomcat:8.0
MAINTAINER suraj
COPY codingchallenegejan8/bankdata/target/bankdata-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/
