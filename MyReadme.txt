 3939  vi ~/.zshrc
 3940  j17
 3941  (/usr/libexec/java_home\nexit
 3942  /usr/libexec/java_home\nexit
 3943  ll /usr/local/Cellar/openjdk@11/17
 3944  ll /usr/local/Cellar/openjdk@17
 3945  cd /usr/local/Cellar/openjdk@17
 3946  ll
 3947  cd 17.0.3
 3948  ll
 3949  cd libexec
 3950  ll
 3951  vi ~/.zshrc
 3952  cd openjdk.jdk
 3953  ll
 3954  cd Contents/Home
 3955  pwd
 3956  export JAVA_HOME=/usr/local/Cellar/openjdk@17/17.0.3/libexec/openjdk.jdk/Contents/Home
 3957  java -version
 3958  cd pp/pp-basic-adapter
 3959  ./gradlew build
 3960  java -version
 3961  export JAVA_HOME=/usr/local/Cellar/openjdk@17/17.0.3/libexec/openjdk.jdk/Contents/Home
 3962  java -version
 3963  ./gradlew build
 3964  cp ~/Downloads/pp*.jar .
 3965  ll *.jar
 3966  ./gradlew build
 3967  ll
 3968  cd build
 3969  cd libs
 3970  ll
 3971  java  -Dconfig-path=/Users/lihuagao/pp/pp-basic-adapter/config/real-local-config.json -jar pp-basic-adapter-0.8.2.jar
 3972  export PP_LOG_LEVEL=DEBUG
 3973  java  -Dconfig-path=/Users/lihuagao/pp/pp-basic-adapter/config/real-local-config.json -jar pp-basic-adapter-0.8.2.jar
 3974  java  -Dconfig-path=/Users/lihuagao/pp/pp-basic-adapter/config/real-local-config.json  -Ddev-simulate-aws-access=true -jar pp-basic-adapter-0.8.2.jar
 3975* cd ~
 3976* brew install --cask eclipse-java
 3977* cd springboottest
 3978* ll
 3979* cd spring
 3980* cd springboot
 3981* code .
 3982* cd ..
 3983* cd pp
 3984* unzip ~/Downloads/Vertx.zip
 3985* cd Vertx
 3986* java -version
 3987* code .

Pp3 copy 2x *.jar
. java17. <=. . at beginning
export JAVA_HOME=/usr/local/Cellar/openjdk@17/17.0.3/libexec/openjdk.jdk/Contents/Home
 ./gradlew build. 

OK
pp3
export PP_LOG_LEVEL=DEBUG
java -Dconfig-path=/Users/lihuagao/pp/pp-basic-adapter/config/real-local-config.json -Ddev-simulate-aws-access=true -jar pp-basic-adapter-0.8.2.jar

OK

Run AdapterVerticleTest. As gradle test in eclipse NOK

Pp2/pp-commons
. java17

 ./gradlew build

RealSecretConnectorTest > initializationError FAILED
    java.time.format.DateTimeParseException at RealSecretConnectorTest.java:37

545 tests completed, 1 failed, 2 skipped


In eclipse ConfigTest CM => run as gradle test OK (vorher run as JUnit Test)



