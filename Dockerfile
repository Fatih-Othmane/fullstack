# Étape 1 : Compilation avec Maven
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Étape 2 : Exécution avec une image légère
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# On copie le JAR généré lors de l'étape de build
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]