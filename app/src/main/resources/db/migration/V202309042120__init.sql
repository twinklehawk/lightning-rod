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
    humidity_percent INTEGER NOT NULL,
    wind_direction_degrees INTEGER NOT NULL,
    wind_speed_mph DECIMAL NOT NULL,
    wind_gust_mph DECIMAL NOT NULL,
    hourly_rainfall_inches DECIMAL NOT NULL,
    event_rainfall_inches DECIMAL NOT NULL,
    daily_rainfall_inches DECIMAL NOT NULL,
    solar_radiation DECIMAL NOT NULL,
    uv_index INTEGER NOT NULL
);
CREATE INDEX IF NOT EXISTS weather_measurements_measured_at_idx ON weather_measurements (measured_at);
