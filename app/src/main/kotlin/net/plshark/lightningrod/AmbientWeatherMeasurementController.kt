package net.plshark.lightningrod

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/ambient-weather/measurement")
class AmbientWeatherMeasurementController {

    @GetMapping
    fun getAddMeasurement(@RequestParam params: Map<String, String>) {
        println("GET: $params")
    }

    @PostMapping
    fun addMeasurement(@RequestParam params: Map<String, String>) {
        println("POST: $params")
    }
}
