package net.plshark.lightningrod.app

    // https://ambientweather.com/faqs/question/view/id/1857/
data class AmbientWeatherMeasurementRequest(
    // Device Mac address. Colons included.
    // named MAC
    val mac: String,
    // YYYY-MM-DD HH:MM:SS in UTC
    val dateutc: String,
    // 0-360º instantaneous wind direction
    val winddir: Int,
    // instantaneous wind speed in mph
    val windspeedmph: Float,
    // instantaneous wind gust in mph
    val windgustmph: Float,
    // Wind direction at which the wind gust occurred, 0-360º, integer, º (degrees)
    val windgustdir: Any,
    // Max daily gust, Float, mph
    val maxdailygust: Any,
    // Average wind speed, 2 minute average, float, mph
    val windspdmph_avg2m: Any,
    // Average wind direction, 2 minute average, integer, º (degrees)
    val winddir_avg2m: Any,
    // Average wind speed, 10 minute average, float, mph
    val windspdmph_avg10m: Any,
    // Average wind direction, 10 minute average, integer, º (degrees)
    val winddir_avg10m: Any,
    // Max Wind Speed in update interval, the default is one minute, integer, º (degrees)
    val windgustmph_interval: Any,
    // Outdoor Humidity, 0-100%, integer, %
    val humidity: Any,
    // Humidity 1, 0-100%, integer, %
    val humidity1: Any,
    // Humidity 2, 0-100%, integer, %
    val humidity2: Any,
    // Humidity 3, 0-100%, integer, %
    val humidity3: Any,
    // Humidity 4, 0-100%, integer, %
    val humidity4: Any,
    // Humidity 5, 0-100%, integer, %
    val humidity5: Any,
    // Humidity 6, 0-100%, integer, %
    val humidity6: Any,
    // Humidity 7, 0-100%, integer, %
    val humidity7: Any,
    // Humidity 8, 0-100%, integer, %
    val humidity8: Any,
    // Humidity 9, 0-100%, integer, %
    val humidity9: Any,
    // Humidity 10, 0-100%, integer, %
    val humidity10: Any,
    // Indoor Humidity, 0-100%, integer, %
    val humidityin: Any,
    // Outdoor Temperature, float, ºF
    val tempf: Any,
    // Temperature 1, float, ºF
    val temp1f: Any,
    // Temperature 2, float, ºF
    val temp2f: Any,
    // Temperature 3, float, ºF
    val temp3f: Any,
    // Temperature 4, float, ºF
    val temp4f: Any,
    // Temperature 5, float, ºF
    val temp5f: Any,
    // Temperature 6, float, ºF
    val temp6f: Any,
    // Temperature 7, float, ºF
    val temp7f: Any,
    // Temperature 8, float, ºF
    val temp8f: Any,
    // Temperature 9, float, ºF
    val temp9f: Any,
    // Temperature 10, float, ºF
    val temp10f: Any,
    // Indoor Temperature, float, ºF
    val tempinf: Any,
    // Hourly Rain, float, in
    val hourlyrainin: Any,
    // Daily Rain, float, in
    val dailyrainin: Any,
    // 24 Hour Rain, float, in
    // named 24hourrainin
    val rain24hourin: Any,
    // Weekly Rain, float, in
    val weeklyrainin: Any,
    // Monthly Rain, float, in
    val monthlyrainin: Any,
    // Yearly Rain, float, in
    val yearlyrainin: Any,
    // Event Rain, float, in
    val eventrainin: Any,
    // Total Rain, float, in
    val totalrain: Any,
    // Relative Pressure, float, inHg
    val baromrelin: Any,
    // Absolute Pressure, float, inHg
    val baromabsin: Any,
    // Ultra-Violet Radiation Index, Integer
    val uv: Any,
    // Solar Radiation, Float, W/m^2
    val solarradiation: Any,
    // CO2 Meter, int, ppm
    val co2: Any,
    // PM2.5 Air Quality Sensor, int, µg/m3
    val pm25: Any,
    // PM2.5 Air Quality Sensor, 24 hour running average, float, µg/m3
    val pm25_24h: Any,
    // PM2.5 Air Quality Sensor, indoor, int, µg/m3
    val pm25_in: Any,
    // PM2.5 Air Quality Sensor indoor, 24 hour running average, float, µg/m3
    val pm25_in_24h: Any,
    // PM1.0 Air Quality Sensor, int, µg/m3
    val pm10_in: Any,
    // PM1.0 Air Quality Sensor, 24 hour running average, float, µg/m3
    val pm10_in_24h: Any,
    // Indoor CO2, int, ppm
    val co2_in: Any,
    // Indoor CO2, 24 hour running average, float, ppm
    val co2_in_24h: Any,
    // Indoor PM sensor temperature, float, ºF
    val pm_in_temp: Any,
    // Indoor PM sensor humidity, int, %
    val pm_in_humidity: Any,
    // Relay 1, discrete 0 or 1
    val relay1: Any,
    // Relay 2, discrete 0 or 1
    val relay2: Any,
    // Relay 3, discrete 0 or 1
    val relay3: Any,
    // Relay 4, discrete 0 or 1
    val relay4: Any,
    // Relay 5, discrete 0 or 1
    val relay5: Any,
    // Relay 6, discrete 0 or 1
    val relay6: Any,
    // Relay 7, discrete 0 or 1
    val relay7: Any,
    // Relay 8, discrete 0 or 1
    val relay8: Any,
    // Relay 9, discrete 0 or 1
    val relay9: Any,
    // Relay 10, discrete 0 or 1
    val relay10: Any,
    // Soil Temperature 1, float, ºF
    val soiltemp1: Any,
    // Soil Temperature 2, float, ºF
    val soilltemp2: Any,
    // Soil Temperature 2, float, ºF
    val soiltemp3: Any,
    // Soil Temperature 3, float, ºF
    val soiltemp4: Any,
    // Soil Temperature 4, float, ºF
    val soiltemp5: Any,
    // Soil Temperature 5, float, ºF
    val soiltemp6: Any,
    // Soil Temperature 6, float, ºF
    val soiltemp7: Any,
    // Soil Temperature 7, float, ºF
    val soiltemp8: Any,
    // Soil Temperature 8, float, ºF
    val soiltemp9: Any,
    // Soil Temperature 9, float, ºF
    val soiltemp10: Any,
    // Soil Moisture 1, integer, %
    val soilhum1: Any,
    // Soil Moisture 2, integer, %
    val soilhum2: Any,
    // Soil Moisture 3, integer, %
    val soilhum3: Any,
    // Soil Moisture 4, integer, %
    val soilhum4: Any,
    // Soil Moisture 5, integer, %
    val soilhum5: Any,
    // Soil Moisture 6, integer, %
    val soilhum6: Any,
    // Soil Moisture 7, integer, %
    val soilhum7: Any,
    // Soil Moisture 8, integer, %
    val soilhum8: Any,
    // Soil Moisture 9, integer, %
    val soilhum9: Any,
    // Soil Moisture 10, integer, %
    val soilhum10: Any,
    // Leak Detection 1, discrete 0 or 1 0=no leak 1=leak detected 2=loss of communication for over 10 minutes.
    val leak1: Any,
    // Leak Detection 2, discrete 0 or 1 0=no leak 1=leak detected 2=loss of communication for over 10 minutes.
    val leak2: Any,
    // Leak Detection 3, discrete 0 or 1 0=no leak 1=leak detected 2=loss of communication for over 10 minutes.
    val leak3: Any,
    // Leak Detection 4, discrete 0 or 1 0=no leak 1=leak detected 2=loss of communication for over 10 minutes.
    val leak4: Any,
    // Last strike date and time, Seconds since January 1, 1970
    val lightning_time: Any,
    // Number of strikes per day, count
    val lightning_day: Any,
    // Distance of last strike, float, km
    val lightning_distance: Any,
    // Low battery indication, outdoor sensor array or suite, discrete 0 or 1
    val battout: Any,
    // Low battery indication, indoor sensor or console, discrete 0 or 1
    val battin: Any,
    // Low battery indication, sensor 1, discrete 0 or 1
    val batt1: Any,
    // Low battery indication, sensor 2, discrete 0 or 1
    val batt2: Any,
    // Low battery indication, sensor 3, discrete 0 or 1
    val batt3: Any,
    // Low battery indication, sensor 4, discrete 0 or 1
    val batt4: Any,
    // Low battery indication, sensor 5, discrete 0 or 1
    val batt5: Any,
    // Low battery indication, sensor 6, discrete 0 or 1
    val batt6: Any,
    // Low battery indication, sensor 7, discrete 0 or 1
    val batt7: Any,
    // Low battery indication, sensor 8, discrete 0 or 1
    val batt8: Any,
    // Low battery indication, sensor 9, discrete 0 or 1
    val batt9: Any,
    // Low battery indication, sensor 10, discrete 0 or 1
    val batt10: Any,
    // Low battery indication, relay 1, discrete 0 or 1
    val battr1: Any,
    // Low battery indication, relay 2, discrete 0 or 1
    val battr2: Any,
    // Low battery indication, relay 3, discrete 0 or 1
    val battr3: Any,
    // Low battery indication, relay 4, discrete 0 or 1
    val battr4: Any,
    // Low battery indication, relay 5, discrete 0 or 1
    val battr5: Any,
    // Low battery indication, relay 6, discrete 0 or 1
    val battr6: Any,
    // Low battery indication, relay 7, discrete 0 or 1
    val battr7: Any,
    // Low battery indication, relay 8, discrete 0 or 1
    val battr8: Any,
    // Low battery indication, relay 9, discrete 0 or 1
    val battr9: Any,
    // Low battery indication, relay 10, discrete 0 or 1
    val battr10: Any,
    // Low battery indication, PM2.5, discrete 0 or 1
    val batt_25: Any,
    // Low battery indication, PM2.5 indoor, discrete 0 or 1
    val batt_25in: Any,
    // Leak Detection, sensor 1, discrete 0 or 1
    val batleak1: Any,
    // Leak Detection, sensor 2, discrete 0 or 1
    val batleak2: Any,
    // Leak Detection, sensor 3, discrete 0 or 1
    val batleak3: Any,
    // Leak Detection, sensor 4, discrete 0 or 1
    val batleak4: Any,
    // Lighting detector battery, discrete 0 or 1
    val batt_lightning: Any,
    // Soil Moisture 1 battery, discrete 0 or 1
    val battsm1: Any,
    // Soil Moisture 2 battery, discrete 0 or 1
    val battsm2: Any,
    // Soil Moisture 3 battery, discrete 0 or 1
    val battsm3: Any,
    // Soil Moisture 4 battery, discrete 0 or 1
    val battsm4: Any,
    // Rain Gauge battery, discrete 0 or 1
    val battrain: Any,
)
