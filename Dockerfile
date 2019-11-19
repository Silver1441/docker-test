FROM tomcat:9.0.27-jdk11-openjdk

COPY ./target/docker-test-0.0.1-SNAPSHOT.war    /usr/local/tomcat/webapps/docker-test-0.0.1-SNAPSHOT.war
COPY ./tomcat-users.xml                         /usr/local/tomcat/conf/tomcat-users.xml
COPY ./context.xml                              /usr/local/tomcat/webapps/manager/META-INF/context.xml

EXPOSE 8080