# InfinityEyes I Counter

## Build

This will build the Java executable Jar in the backend/target directory. 

``mvn package``

You can run the jar as shown below.

``java -jar target/infinity-eyes-0.0.1-SNAPSHOT.jar ``

## Run

You can view the application by firing up your browser

``http://localhost:8080``

Using Restful API

``curl localhost:8080/counter?text=EngIneerIng``


``curl -X POST -d '{"text":"EngIneerIng"}' localhost:8080/counter``
