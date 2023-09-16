package net.plshark.lightningrod.station

import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StationsServiceTest {

    private val repository = mockk<StationsRepository>()
    private val service = StationsService(repository)

    @Test
    fun `findStationByMac should look up the mac address and map to a station`() = runTest {
        val station = StationEntity(2, "test", "address")
        coEvery { repository.findByMacAddress("address") } returns station
        assertThat(service.findStationByMac("address")).isEqualTo(station.toStation())
    }

    @Test
    fun `findStationByMac should return null if no match found`() = runTest {
        coEvery { repository.findByMacAddress("address") } returns null
        assertThat(service.findStationByMac("address")).isNull()
    }
}
