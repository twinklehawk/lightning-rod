FROM eclipse-temurin:17.0.8_7-jdk

LABEL org.opencontainers.image.title=lightning-rod
LABEL org.opencontainers.image.url=https://github.com/twinklehawk/lightning-rod
LABEL org.opencontainers.image.source=https://github.com/twinklehawk/lightning-rod
LABEL org.opencontainers.image.description="Weather service"
LABEL org.opencontainers.image.licenses=Apache-2.0

RUN adduser -D -H lightningrod

WORKDIR /app
COPY build/libs/app.jar app.jar

USER lightningrod
ENTRYPOINT ["java", "-jar", "app.jar"]
