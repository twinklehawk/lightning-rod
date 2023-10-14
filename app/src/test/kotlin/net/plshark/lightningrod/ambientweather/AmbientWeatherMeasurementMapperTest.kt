package net.plshark.lightningrod.ambientweather

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import java.time.OffsetDateTime
import java.time.ZoneOffset

class AmbientWeatherMeasurementMapperTest {
    @Test
    fun `converts to weather measurement correctly`() {
        val request =
            AmbientWeatherMeasurementRequest(
                stationType = "station",
                passkey = "12:34:56",
                timestamp = "2011-09-20 12:34:56",
                temperature = BigDecimal(89),
                humidityPercent = 56,
                windDirectionDegrees = 90,
                windSpeedMph = BigDecimal(120),
                windGustMph = BigDecimal("400.5"),
                hourlyRainfallInches = BigDecimal(2),
                eventRainfallInches = BigDecimal("1.5"),
                dailyRainfallInches = BigDecimal("2.5"),
                solarRadiation = BigDecimal("1.23"),
                uvIndex = 5,
            )
        val stationId = 5L

        val result = request.toWeatherMeasurement(stationId)

        assertThat(result.id).isNull()
        assertThat(result.stationId).isEqualTo(stationId)
        assertThat(result.measuredAt).isEqualTo(OffsetDateTime.of(2011, 9, 20, 12, 34, 56, 0, ZoneOffset.UTC))
        assertThat(result.temperature).isEqualTo(request.temperature)
        assertThat(result.humidityPercent).isEqualTo(request.humidityPercent)
        assertThat(result.windDirectionDegrees).isEqualTo(90)
        assertThat(result.windSpeedMph).isEqualTo(request.windSpeedMph)
        assertThat(result.windGustMph).isEqualTo(request.windGustMph)
        assertThat(result.hourlyRainfallInches).isEqualTo(request.hourlyRainfallInches)
        assertThat(result.eventRainfallInches).isEqualTo(request.eventRainfallInches)
        assertThat(result.dailyRainfallInches).isEqualTo(request.dailyRainfallInches)
        assertThat(result.solarRadiation).isEqualTo(request.solarRadiation)
        assertThat(result.uvIndex).isEqualTo(5)
    }
}
