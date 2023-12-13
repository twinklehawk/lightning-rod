FROM eclipse-temurin:17.0.9_9-jdk@sha256:8f7407f347796b01edaaae559e50d73407fa5e210e2f93470a1bfe3ae698bc2e

LABEL org.opencontainers.image.title=lightning-rod
LABEL org.opencontainers.image.url=https://github.com/twinklehawk/lightning-rod
LABEL org.opencontainers.image.source=https://github.com/twinklehawk/lightning-rod
LABEL org.opencontainers.image.description="Weather service"
LABEL org.opencontainers.image.licenses=Apache-2.0

WORKDIR /app
COPY build/libs/app.jar app.jar

# Set user and group
ARG user=lightningrod
ARG group=lightningrod
ARG uid=1000
ARG gid=1000
RUN groupadd -g ${gid} ${group}
RUN useradd -u ${uid} -g ${group} ${user}
USER ${user}

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
