
FROM  adoptopenjdk/openjdk8
ADD /target/GitDemoApp-0.0.1-SNAPSHOT.war charity.war
ENTRYPOINT ["java", "-jar", "/charity.war"]

