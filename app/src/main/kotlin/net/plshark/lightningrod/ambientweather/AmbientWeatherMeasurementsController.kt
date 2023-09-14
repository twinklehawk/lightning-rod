package net.plshark.lightningrod.ambientweather

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/ambient-weather/measurements")
class AmbientWeatherMeasurementsController(
    private val service: AmbientWeatherMeasurementsService,
    private val paramsParser: AmbientWeatherQueryParamsParser,
) {

    @GetMapping
    suspend fun saveWeatherMeasurement(@RequestParam params: Map<String, String>) {
        val request = paramsParser.parseToRequest(params)
        service.saveWeatherMeasurement(request)
    }
}
