package net.plshark.lightningrod.measurement

import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import java.time.OffsetDateTime
import java.time.ZoneOffset

class WeatherMeasurementsServiceTest {

    private val repository = mockk<WeatherMeasurementsRepository>()
    private val service = WeatherMeasurementsService(repository)

    @Test
    fun `saveWeatherMeasurement saves to the repository`() = runTest {
        val measurement = WeatherMeasurement(
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
        val entity = measurement.toWeatherMeasurementEntity()
        coEvery { repository.save(entity) } returns entity.copy(id = 40)

        assertThat(service.saveWeatherMeasurement(measurement))
            .isEqualTo(entity.copy(id = 40).toWeatherMeasurement())
    }
}
