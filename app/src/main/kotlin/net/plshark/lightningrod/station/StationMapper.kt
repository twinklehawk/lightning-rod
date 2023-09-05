package net.plshark.lightningrod.station

fun Station.toStationEntity() =
    StationEntity(
        this.id,
        this.name,
        this.macAddress,
    )

fun StationEntity.toStation() =
    Station(
        this.id,
        this.name,
        this.macAddress,
    )
