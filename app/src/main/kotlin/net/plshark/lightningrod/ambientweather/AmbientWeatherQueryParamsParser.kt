package net.plshark.lightningrod.ambientweather

import org.springframework.stereotype.Component
import java.math.BigDecimal

@Component
class AmbientWeatherQueryParamsParser {

    fun parseToRequest(queryParams: Map<String, String>): AmbientWeatherMeasurementRequest {
        return AmbientWeatherMeasurementRequest(
            parseString(queryParams, AmbientWeatherMeasurementRequest.STATION_TYPE),
            parseString(queryParams, AmbientWeatherMeasurementRequest.PASSKEY),
            parseString(queryParams, AmbientWeatherMeasurementRequest.TIMESTAMP),
            parseFloat(queryParams, AmbientWeatherMeasurementRequest.TEMPERATURE),
            parseInt(queryParams, AmbientWeatherMeasurementRequest.HUMIDITY),
            parseInt(queryParams, AmbientWeatherMeasurementRequest.WIND_DIRECTION),
            parseFloat(queryParams, AmbientWeatherMeasurementRequest.WIND_SPEED),
            parseFloat(queryParams, AmbientWeatherMeasurementRequest.WIND_GUST),
            parseFloat(queryParams, AmbientWeatherMeasurementRequest.HOURLY_RAINFALL),
            parseFloat(queryParams, AmbientWeatherMeasurementRequest.EVENT_RAINFALL),
            parseFloat(queryParams, AmbientWeatherMeasurementRequest.DAILY_RAINFALL),
            parseFloat(queryParams, AmbientWeatherMeasurementRequest.SOLAR_RADIATION),
            parseInt(queryParams, AmbientWeatherMeasurementRequest.UV),
        )
    }

    private fun parseFloat(map: Map<String, String>, field: String) = BigDecimal(parseString(map, field))

    private fun parseInt(map: Map<String, String>, field: String) = parseString(map, field).toInt()

    private fun parseString(map: Map<String, String>, field: String) =
        // TODO exception type
        map[field] ?: throw IllegalArgumentException("No value for required field $field")
}
