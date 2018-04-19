# InfinityEyes counting I's web app

![](https://media.giphy.com/media/5QMREswdnd7YQkWaUR/giphy.gif)

## Project struture
```
src
├── main
│   ├── java
│   ├── resources
│   └── ui
└── test
    └── java
```

## Build

This will build the Java executable Jar in the target directory. 

``mvn package``

You can then run the jar as shown below.

``java -jar target/infinity-eyes-0.0.1-SNAPSHOT.jar ``

## Usage

You can view the application by firing up your browser.

``http://localhost:8080``

Or using RESTful API.

``curl localhost:8080/counter?text=EngIneerIng``


``curl -X POST -d '{"text":"EngIneerIng"}' localhost:8080/counter``
