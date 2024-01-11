FROM eclipse-temurin:21.0.1_12-jdk@sha256:dcb6797bf14447735160a1d03696ddfc48cee71a464d098cef524308d313ea1a

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
