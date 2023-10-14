package net.plshark.lightningrod.ambientweather

import net.plshark.lightningrod.exception.BadRequestException
import net.plshark.lightningrod.measurement.WeatherMeasurementsService
import net.plshark.lightningrod.station.StationsService
import org.springframework.stereotype.Service

@Service
class AmbientWeatherMeasurementsService(
    private val measurementService: WeatherMeasurementsService,
    private val stationsService: StationsService,
) {
    suspend fun saveWeatherMeasurement(measurementRequest: AmbientWeatherMeasurementRequest) {
        getStationId(measurementRequest.passkey)
            .let { stationId -> measurementRequest.toWeatherMeasurement(stationId) }
            .let { measurementService.saveWeatherMeasurement(it) }
    }

    private suspend fun getStationId(macAddress: String): Long {
        return stationsService.findStationByMac(macAddress)?.id
            ?: throw BadRequestException("No station found for mac address $macAddress")
    }
}
