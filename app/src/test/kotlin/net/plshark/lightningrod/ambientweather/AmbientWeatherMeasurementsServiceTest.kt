package net.plshark.lightningrod.ambientweather

import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import net.plshark.lightningrod.measurement.WeatherMeasurementsService
import net.plshark.lightningrod.station.Station
import net.plshark.lightningrod.station.StationsService
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.math.BigDecimal

class AmbientWeatherMeasurementsServiceTest {

    private val measurementService = mockk<WeatherMeasurementsService>()
    private val stationsService = mockk<StationsService>()
    private val service = AmbientWeatherMeasurementsService(measurementService, stationsService)

    @Test
    fun `saveWeatherMeasurement should look up the station, map the request, and pass to the service`() = runTest {
        val request = buildDummyRequest()
        val measurement = request.toWeatherMeasurement(1)
        coEvery { stationsService.findStationByMac(request.passkey) } returns
            Station(1, "station", request.passkey)
        coEvery { measurementService.saveWeatherMeasurement(measurement) } returns measurement.copy(id = 5)

        service.saveWeatherMeasurement(request)

        coVerify { measurementService.saveWeatherMeasurement(measurement) }
    }

    @Test
    fun `saveWeatherMeasurement should throw an exception for an unknown station`() = runTest {
        val request = buildDummyRequest()
        coEvery { stationsService.findStationByMac(request.passkey) } returns null

        assertThrows<IllegalArgumentException> { service.saveWeatherMeasurement(request) }
    }

    private fun buildDummyRequest() =
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
}
