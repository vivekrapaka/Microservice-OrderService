
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY build/libs/orderservice-0.0.1-SNAPSHOT app.jar

EXPOSE 8001

CMD ["java" ,"-jar", "app.jar"]
