# Docker
To build the docker image
> docker build -t hellotest --build-arg JAR_FILE=./build/libs/hello-rest.jar .

Tu run the docker image
> docker run -d -p 8088:8080 hellotest

