FROM openjdk:8-alpine
ADD target/HelloController-0.0.1-SNAPSHOT.jar /usr/share/HelloController-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/HelloController-0.0.1-SNAPSHOT.jar"]