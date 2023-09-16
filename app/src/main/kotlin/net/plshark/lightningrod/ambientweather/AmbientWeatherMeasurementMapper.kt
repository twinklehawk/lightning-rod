package net.plshark.lightningrod.ambientweather

import net.plshark.lightningrod.measurement.WeatherMeasurement
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

fun AmbientWeatherMeasurementRequest.toWeatherMeasurement(stationId: Long): WeatherMeasurement {
    val odt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        .parse(this.timestamp)
        .let { LocalDateTime.from(it) }
        .let { OffsetDateTime.of(it, ZoneOffset.UTC) }
    return WeatherMeasurement(
        id = null,
        stationId = stationId,
        measuredAt = odt,
        temperature = BigDecimal(this.temperature.toString()),
        humidityPercent = this.humidityPercent,
        windDirectionDegrees = this.windDirectionDegrees,
        windGustMph = BigDecimal(this.windGustMph.toString()),
        windSpeedMph = BigDecimal(this.windSpeedMph.toString()),
        hourlyRainfallInches = BigDecimal(this.hourlyRainfallInches.toString()),
        eventRainfallInches = BigDecimal(this.eventRainfallInches.toString()),
        dailyRainfallInches = BigDecimal(this.dailyRainfallInches.toString()),
        solarRadiation = BigDecimal(this.solarRadiation.toString()),
        uvIndex = this.uvIndex,
    )
}
