package net.plshark.lightningrod.station

import org.springframework.stereotype.Service

@Service
class StationsService(
    private val repository: StationsRepository,
) {
    suspend fun findStationByMac(macAddress: String): Station? {
        return repository.findByMacAddress(macAddress)?.toStation()
    }
}
