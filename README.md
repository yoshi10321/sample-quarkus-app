`export GRAALVM_HOME=$HOME/Development/graalvm/Contents/Home/`

`./gradlew buildNative --docker-build=true`

`docker build -f Dockerfile -t sample/quarkus-app .`

`docker run -i --rm -p 8080:8080 sample/quarkus-app`