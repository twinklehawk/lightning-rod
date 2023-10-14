package net.plshark.lightningrod.ambientweather

import io.mockk.coJustRun
import io.mockk.coVerify
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class AmbientWeatherMeasurementsControllerTest {
    private val service = mockk<AmbientWeatherMeasurementsService>()
    private val paramsParser = mockk<AmbientWeatherQueryParamsParser>()
    private val controller = AmbientWeatherMeasurementsController(service, paramsParser)

    @Test
    fun `maps the query parameters to a request object and calls the service`() =
        runTest {
            val queryParams = mapOf(AmbientWeatherMeasurementRequest.STATION_TYPE to "station")
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
            every { paramsParser.parseToRequest(queryParams) } returns request
            coJustRun { service.saveWeatherMeasurement(request) }

            controller.saveWeatherMeasurement(queryParams)

            coVerify { service.saveWeatherMeasurement(request) }
        }
}
