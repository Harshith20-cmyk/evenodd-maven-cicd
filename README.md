# Even/Odd Maven Application

A small Java command-line application with JUnit 5 tests, Maven build, GitHub Actions CI/CD, and Docker Hub publishing.

## Requirements
- JDK 21
- Maven 3.9+
- Git
- Docker Desktop (for local Docker testing)

## Run tests and build
```bash
mvn clean verify
```

## Run the application
```bash
java -jar target/evenodd-app-1.0.0.jar 12
```

## Run with Docker
```bash
docker build -t evenodd-app .
docker run --rm evenodd-app 12
```

## GitHub Actions / Docker Hub
Add these repository Actions secrets:
- `DOCKERHUB_USERNAME`: your Docker Hub username
- `DOCKERHUB_TOKEN`: a Docker Hub access token

Pushing to `main` runs tests and builds the JAR. If tests pass, GitHub Actions builds and publishes the Docker image to Docker Hub.
