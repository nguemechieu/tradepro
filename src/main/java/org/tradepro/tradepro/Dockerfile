FROM eclipse-temurin:latest
RUN  apt-get update -y
WORKDIR /tradepro
COPY ./mvn ./mvn
RUN ./mvnw dependencies :resolved
CMD ["java -jar","tradepro 1.0-SNAPSHOT"]