package src.main.scala.models

abstract class Grenade {
    val cost: Int
    val effectRadius: Double
    val damage: Double
}

class Flashbang() extends Grenade{
    val cost: Int = 200
    val effectRadius: Double = 10.0
    val damage: Double = 0.0

    val blindDuration: Double = 3.0 // max, scaled down based on distance
}

class HEGrenade() extends Grenade{
    val cost: Int = 300
    val effectRadius: Double = 7.5
    val damage: Double = 100.0 // max, scaled down based on distance
}

class Molotov() extends Grenade{
    val cost: Int = 400
    val effectRadius: Double = 7.5
    val damage: Double = 15.0 // per second, over duration

    val burnDuration: Double = 5.0
}

class IncendiaryGrenade() extends Grenade{
    val cost: Int = 600
    val effectRadius: Double = 5.5
    val damage: Double = 12.0 // per second, over duration

    val burnDuration: Double = 7.0
}

class SmokeGrenade() extends Grenade{
    val cost: Int = 300
    val effectRadius: Double = 10.0
    val damage: Double = 0.0

    val smokeDuration: Double = 15.0
}