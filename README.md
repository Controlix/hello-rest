# Docker
To build the docker image
> docker build -t controlix/hello-rest --build-arg JAR_FILE=./build/libs/hello-rest.jar .

Tu run the docker image
> docker run -d -p 8088:8080 hellotest

To push the docker image to docker hub
> docker login
> docker push controlix/hello-rest

