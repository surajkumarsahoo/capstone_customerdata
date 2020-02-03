FROM tomcat:8.0
RUN echo 'Deploying War on Server'
COPY /root/.jenkins/workspace/capstone_bankdata_pipeline/codingchallenegejan8/bankdata/target/bankdata-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps
