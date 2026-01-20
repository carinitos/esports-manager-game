package src.main.scala.models

abstract class Player {
    val rifleProficiency: Double
    val pistolProficiency: Double
    val awpProficiency: Double

    val contractLength: Int
    val rating: Double
    val consistency: Double
    val poise: Double

    val preferredWeapons: Seq[Weapon]
    val preferredGrenades: Seq[Grenade]

    val utilityAccuracy: Double
    val headshotPercentage: Double
    val ctRating: Double
    val tRating: Double
    val entryRounds: Double
    val cluchRounds: Double
    val supportRounds: Double
    val multiKillRounds: Double
    val deathsPerRound: Double
    }

abstract class Coach extends Player {
    val strategies: Seq[Strategy]
    val influence: Double
 }