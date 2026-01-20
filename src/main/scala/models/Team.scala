package src.main.scala.models

abstract class Team {
    val numberOfPlayers: Double
    val coach: Player
    val permaBan: Arena
    val roster: Map[Player, Map[Boolean, Role]] // player w/ role for both CT and T sides
    val mapPicks: Seq[Arena] // ordered by preference (if map is banned, pick next one)
    val tendency: Playstyle // thrive in chaos vs methodical or something in the middle
}
