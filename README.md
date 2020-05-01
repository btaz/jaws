# JAWS

## Dev Mode Web Application

```
yarn watch
```

## Build Web Application

```
yarn build
```

## Build Springboot Application

```
./gradlew clean build
```

## Run Springboot Application (e.g. 12345)

```
./gradlew build && java -jar build/libs/jaws-0.0.1-SNAPSHOT.jar
```

## Build Webapp and Run Springboot Application (e.g. 12345)

```
yarn build && ./gradlew build && java -jar build/libs/jaws-0.0.1-SNAPSHOT.jar
```

## Gradle

### Create a Gradle Wrapper

```
gradle wrapper
```

## Webpack

### Production Mode
webpack.config.prod.js

```
mode: 'production',
devtool: 'source-map',
devtool: 'inline-source-map',
```

### Development Mode
webpack.config.prod.js

```
mode: 'development',
devtool: 'eval-source-map',
```