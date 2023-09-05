package net.plshark.lightningrod.ambientweather

import java.math.BigDecimal

// From https://ambientweather.com/faqs/question/view/id/1857/
data class AmbientWeatherMeasurementRequest(
    val stationType: String,
    val passkey: String,
    val timestamp: String,
    val temperature: BigDecimal,
    val humidityPercent: Int,
    val windDirectionDegrees: Int,
    val windSpeedMph: BigDecimal,
    val windGustMph: BigDecimal,
    val hourlyRainfallInches: BigDecimal,
    val eventRainfallInches: BigDecimal,
    val dailyRainfallInches: BigDecimal,
    val solarRadiation: BigDecimal,
    val uvIndex: Int,
) {
    companion object {
        /** station type, ex. "AMBWeatherV4.3.4" */
        const val STATION_TYPE = "stationtype"

        /** station MAC address including colons, ex. "12:34:56:78:90:12 */
        const val PASSKEY = "PASSKEY"

        /** UTC timestamp formatted as yyyy-MM-dd HH:mm:ss */
        const val TIMESTAMP = "dateutc"

        /** indoor temperature in F with 1 decimal place */
        const val INDOOR_TEMPERATURE = "tempinf"

        /** indoor low battery indicator, 0 or 1, 0 indicates low battery */
        const val INDOOR_LOW_BATTERY = "battin"

        /** indoor humidity % */
        const val INDOOR_HUMIDITY = "humidityin"

        /** indoor relative barometric pressure inHg, ex. 29.720 */
        const val INDOOR_RELATIVE_PRESSURE = "baromrelin"

        /** indoor absolute barometric pressure inHg, ex. 29.720 */
        const val IN_ABSOLUTE_PRESSURE = "baromabsin"

        /** outdoor temperature in F with 1 decimal place */
        const val TEMPERATURE = "tempf"

        /** outdoor low battery indicate, 0 or 1, 0 indicates low battery */
        const val LOW_BATTERY = "battout"

        /** outdoor humidity % */
        const val HUMIDITY = "humidity"

        /** wind direction, 0-360 degrees */
        const val WIND_DIRECTION = "winddir"

        /** 10 minute average wind direction, 0-360 degrees */
        const val TEN_MIN_AVG_WIND_DIRECTION = "winddir_avg10m"

        /** wind speed in mph with 1 decimal place */
        const val WIND_SPEED = "windspeedmph"

        /** 10 minute average wind speed in mph with 1 decimal place */
        const val TEN_MIN_AVG_WIND_SPEED = "windspdmph_avg10m"

        /** wind gust in mph with 1 decimal place */
        const val WIND_GUST = "windgustmph"

        /** 10 minute average wind gust in mph with 1 decimal place */
        const val MAX_DAILY_WIND_GUST = "maxdailygust"

        /** hourly rainfall in inches with 3 decimal places */
        const val HOURLY_RAINFALL = "hourlyrainin"

        /** event rainfall in inches with 3 decimal places */
        const val EVENT_RAINFALL = "eventrainin"

        /** daily rainfall in inches with 3 decimal places */
        const val DAILY_RAINFALL = "dailyrainin"

        /** weekly rainfall in inches with 3 decimal places */
        const val WEEKLY_RAINFALL = "weeklyrainin"

        /** monthly rainfall in inches with 3 decimal places */
        const val MONTHLY_RAINFALL = "monthlyrainin"

        /** yearly rainfall in inches with 3 decimal places */
        const val YEARLY_RAINFALL = "yearlyrainin"

        /** solar radiation in W/m^2 with 2 decimal places */
        const val SOLAR_RADIATION = "solarradiation"

        /** UV radiation index */
        const val UV = "uv"

        /** ??? */
        const val BATTERY_CO2 = "batt_co2"
    }
}
