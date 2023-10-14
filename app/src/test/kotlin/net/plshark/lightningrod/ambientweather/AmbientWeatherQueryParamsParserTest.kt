package net.plshark.lightningrod.ambientweather

import net.plshark.lightningrod.exception.BadRequestException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.math.BigDecimal

class AmbientWeatherQueryParamsParserTest {
    private val parser = AmbientWeatherQueryParamsParser()

    @Test
    fun `correctly parses each field into the request object`() {
        val queryParams =
            mapOf(
                AmbientWeatherMeasurementRequest.STATION_TYPE to "station",
                AmbientWeatherMeasurementRequest.PASSKEY to "12:34:56",
                AmbientWeatherMeasurementRequest.TIMESTAMP to "2011-09-20 12:34:56",
                AmbientWeatherMeasurementRequest.TEMPERATURE to "89.0",
                AmbientWeatherMeasurementRequest.HUMIDITY to "56",
                AmbientWeatherMeasurementRequest.WIND_DIRECTION to "90",
                AmbientWeatherMeasurementRequest.WIND_SPEED to "120.0",
                AmbientWeatherMeasurementRequest.WIND_GUST to "400.5",
                AmbientWeatherMeasurementRequest.HOURLY_RAINFALL to "2.0",
                AmbientWeatherMeasurementRequest.EVENT_RAINFALL to "1.5",
                AmbientWeatherMeasurementRequest.DAILY_RAINFALL to "2.5",
                AmbientWeatherMeasurementRequest.SOLAR_RADIATION to "1.23",
                AmbientWeatherMeasurementRequest.UV to "5",
            )
        val request = parser.parseToRequest(queryParams)

        assertThat(request.stationType).isEqualTo("station")
        assertThat(request.passkey).isEqualTo("12:34:56")
        assertThat(request.timestamp).isEqualTo("2011-09-20 12:34:56")
        assertThat(request.temperature).isEqualTo(BigDecimal("89.0"))
        assertThat(request.humidityPercent).isEqualTo(56)
        assertThat(request.windDirectionDegrees).isEqualTo(90)
        assertThat(request.windSpeedMph).isEqualTo(BigDecimal("120.0"))
        assertThat(request.windGustMph).isEqualTo(BigDecimal("400.5"))
        assertThat(request.hourlyRainfallInches).isEqualTo(BigDecimal("2.0"))
        assertThat(request.eventRainfallInches).isEqualTo(BigDecimal("1.5"))
        assertThat(request.dailyRainfallInches).isEqualTo(BigDecimal("2.5"))
        assertThat(request.solarRadiation).isEqualTo(BigDecimal("1.23"))
        assertThat(request.uvIndex).isEqualTo(5)
    }

    @Test
    fun `should throw an exception if a required parameter is missing`() {
        val queryParams = mapOf(AmbientWeatherMeasurementRequest.STATION_TYPE to "station")

        assertThrows<BadRequestException> { parser.parseToRequest(queryParams) }
    }
}
