package net.plshark.lightningrod.measurement

import java.math.BigDecimal
import java.time.OffsetDateTime

data class WeatherMeasurement(
    val id: Long? = null,
    val stationId: Long,
    val measuredAt: OffsetDateTime,
    val temperature: BigDecimal,
    val humidityPercent: Int,
    val windDirectionDegrees: Int,
    val windSpeedMph: BigDecimal,
    val windGustMph: BigDecimal,
    val hourlyRainfallInches: BigDecimal,
    val eventRainfallInches: BigDecimal,
    val dailyRainfallInches: BigDecimal,
    val solarRadiation: BigDecimal,
    val uvIndex: Int,
)
