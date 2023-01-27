
FROM eclipse-temurin:latest
RUN echo "Setting up app directory"
WORKDIR /tradepro
RUN echo "init marven"
COPY .mvn/ .mvn
RUN echo "Configuring marven with pom.xml"
COPY mvnw pom.xml ./
RUN echo "Copy src directory to dest directory"
COPY src ./src
RUN echo "Updating  ubuntu package"
RUN apt-get update
RUN echo "Resolving app directory dependencies"
RUN ./mvnw dependency:resolve
RUN ./mvnw  clean install
RUN echo "STARTING  APPLICATION"
CMD [ "./mvnw" ,"java-jar tradepro-1.0-SNAPSHOT." ]
