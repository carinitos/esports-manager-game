package src.main.scala.models

abstract class Tournament {
    val name: String
    val teams: Seq[Team]
    val matches: Seq[Match]
    val prizePool: Int
    val location: String
    val startDate: String
    val endDate: String
    val mapPool: Seq[Arena]
}