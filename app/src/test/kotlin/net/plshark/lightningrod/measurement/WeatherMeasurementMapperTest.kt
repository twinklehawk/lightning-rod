package net.plshark.lightningrod.measurement

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import java.time.OffsetDateTime
import java.time.ZoneOffset

class WeatherMeasurementMapperTest {
    @Test
    fun `mapToEntity maps correctly`() {
        val dto =
            WeatherMeasurement(
                id = 100,
                stationId = 12,
                measuredAt = OffsetDateTime.of(2023, 9, 4, 16, 40, 30, 0, ZoneOffset.UTC),
                temperature = BigDecimal("89.5"),
                humidityPercent = 50,
                windDirectionDegrees = 180,
                windSpeedMph = BigDecimal(30),
                windGustMph = BigDecimal(40),
                hourlyRainfallInches = BigDecimal(26),
                eventRainfallInches = BigDecimal(10),
                dailyRainfallInches = BigDecimal(100),
                solarRadiation = BigDecimal("18.6"),
                uvIndex = 5,
            )
        val expected =
            WeatherMeasurementEntity(
                dto.id,
                dto.stationId,
                dto.measuredAt,
                dto.temperature,
                dto.humidityPercent,
                dto.windDirectionDegrees,
                dto.windSpeedMph,
                dto.windGustMph,
                dto.hourlyRainfallInches,
                dto.eventRainfallInches,
                dto.dailyRainfallInches,
                dto.solarRadiation,
                dto.uvIndex,
            )

        assertThat(dto.toWeatherMeasurementEntity()).isEqualTo(expected)
    }

    @Test
    fun `mapToDto maps correctly`() {
        val entity =
            WeatherMeasurementEntity(
                id = 100,
                stationId = 12,
                measuredAt = OffsetDateTime.of(2023, 9, 4, 16, 40, 30, 0, ZoneOffset.UTC),
                temperature = BigDecimal("89.5"),
                humidityPercent = 50,
                windDirectionDegrees = 180,
                windSpeedMph = BigDecimal(30),
                windGustMph = BigDecimal(40),
                hourlyRainfallInches = BigDecimal(26),
                eventRainfallInches = BigDecimal(10),
                dailyRainfallInches = BigDecimal(100),
                solarRadiation = BigDecimal("18.6"),
                uvIndex = 5,
            )
        val expected =
            WeatherMeasurement(
                entity.id,
                entity.stationId,
                entity.measuredAt,
                entity.temperature,
                entity.humidityPercent,
                entity.windDirectionDegrees,
                entity.windSpeedMph,
                entity.windGustMph,
                entity.hourlyRainfallInches,
                entity.eventRainfallInches,
                entity.dailyRainfallInches,
                entity.solarRadiation,
                entity.uvIndex,
            )

        assertThat(entity.toWeatherMeasurement()).isEqualTo(expected)
    }
}
