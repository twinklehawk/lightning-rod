package net.plshark.lightningrod.station

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("stations")
data class StationEntity(
    @Id
    val id: Long?,
    val name: String,
    val macAddress: String,
)
