package net.plshark.lightningrod.measurement

import org.springframework.stereotype.Service

@Service
class WeatherMeasurementsService(
    private val repository: WeatherMeasurementsRepository,
) {
    suspend fun saveWeatherMeasurement(measurement: WeatherMeasurement): WeatherMeasurement {
        val entity = measurement.toWeatherMeasurementEntity()
        return repository.save(entity).toWeatherMeasurement()
    }
}
