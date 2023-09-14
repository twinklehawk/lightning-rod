CREATE TABLE IF NOT EXISTS stations
(
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(128) NOT NULL,
    mac_address VARCHAR(128) NOT NULL
);
CREATE INDEX IF NOT EXISTS stations_mac_address_idx ON stations (mac_address);

CREATE TABLE IF NOT EXISTS weather_measurements
(
    id BIGSERIAL PRIMARY KEY,
    station_id BIGINT NOT NULL REFERENCES stations ON DELETE CASCADE,
    measured_at TIMESTAMP WITH TIME ZONE NOT NULL,
    temperature DECIMAL NOT NULL,
    humidityPercent INTEGER NOT NULL,
    windDirectionDegrees INTEGER NOT NULL,
    windSpeedMph DECIMAL NOT NULL,
    windGustMph DECIMAL NOT NULL,
    hourlyRainfallInches DECIMAL NOT NULL,
    eventRainfallInches DECIMAL NOT NULL,
    dailyRainfallInches DECIMAL NOT NULL,
    solarRadiation DECIMAL NOT NULL,
    uvIndex INTEGER NOT NULL
);
CREATE INDEX IF NOT EXISTS weather_measurements_measured_at_idx ON weather_measurements (measured_at);
