FROM eclipse-temurin:21.0.2_13-jdk@sha256:18f800a7a9b4e69567694315d7abba066ef33ed321642d872b324f171864e85e

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
