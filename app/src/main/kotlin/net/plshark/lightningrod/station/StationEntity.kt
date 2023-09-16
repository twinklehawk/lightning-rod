package net.plshark.lightningrod.station

import org.springframework.data.annotation.Id

data class StationEntity(
    @Id
    val id: Long?,
    val name: String,
    val macAddress: String,
)
