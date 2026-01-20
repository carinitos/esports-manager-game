package src.main.scala.models

abstract class Weapon {
    val name: String
    val damageVsArmor: Double
    val damageVsNoArmor: Double
    val headshotMultiplier: Double
    val cost: Int
}

trait tSideWeapon 
trait ctSideWeapon
