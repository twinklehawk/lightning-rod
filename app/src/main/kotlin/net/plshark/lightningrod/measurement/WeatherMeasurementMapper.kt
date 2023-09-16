package net.plshark.lightningrod.measurement

fun WeatherMeasurement.toWeatherMeasurementEntity() =
    WeatherMeasurementEntity(
        this.id,
        this.stationId,
        this.measuredAt,
        this.temperature,
        this.humidityPercent,
        this.windDirectionDegrees,
        this.windSpeedMph,
        this.windGustMph,
        this.hourlyRainfallInches,
        this.eventRainfallInches,
        this.dailyRainfallInches,
        this.solarRadiation,
        this.uvIndex,
    )

fun WeatherMeasurementEntity.toWeatherMeasurement() =
    WeatherMeasurement(
        this.id,
        this.stationId,
        this.measuredAt,
        this.temperature,
        this.humidityPercent,
        this.windDirectionDegrees,
        this.windSpeedMph,
        this.windGustMph,
        this.hourlyRainfallInches,
        this.eventRainfallInches,
        this.dailyRainfallInches,
        this.solarRadiation,
        this.uvIndex,
    )
