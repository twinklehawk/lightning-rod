package net.plshark.lightningrod.station

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StationMapperTest {
    @Test
    fun `toStationEntity should map the fields correctly`() {
        val station =
            Station(
                100,
                "test station",
                "12:34:56",
            )
        val entity = station.toStationEntity()

        assertThat(entity.id).isEqualTo(100)
        assertThat(entity.name).isEqualTo("test station")
        assertThat(entity.macAddress).isEqualTo("12:34:56")
    }

    @Test
    fun `toStation should map the fields correctly`() {
        val entity =
            StationEntity(
                100,
                "test station",
                "12:34:56",
            )
        val station = entity.toStation()

        assertThat(station.id).isEqualTo(100)
        assertThat(station.name).isEqualTo("test station")
        assertThat(station.macAddress).isEqualTo("12:34:56")
    }
}
