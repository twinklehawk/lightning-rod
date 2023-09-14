package net.plshark.lightningrod.station

import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StationsRepository : CoroutineCrudRepository<StationEntity, Long> {

    suspend fun findByMacAddress(macAddress: String): StationEntity?
}
