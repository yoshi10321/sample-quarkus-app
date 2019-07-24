Prepare to build. You need to install GraalVM, native-image tool and 
set the environment variables GRAALVM_HOME. 
More detail is in this link.  
https://quarkus.io/guides/building-native-image-guide

To build Native image for docker.  
`./gradlew buildNative --docker-build=true`

docker build  
`docker build -f Dockerfile -t sample/quarkus-app .`

docker run  
`docker run -i --rm -p 8080:8080 sample/quarkus-app`
