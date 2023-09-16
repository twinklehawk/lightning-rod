package net.plshark.lightningrod.measurement

import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface WeatherMeasurementsRepository : CoroutineCrudRepository<WeatherMeasurementEntity, Long>
