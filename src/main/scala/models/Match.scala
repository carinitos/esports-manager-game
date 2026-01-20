package src.main.scala.models

abstract class Match {
    val teams: Seq[Team]
    val games: Seq[Game]
    val bestOf: Int
}

abstract class Game {
    val arena: Arena
    val scores: Map[Team, Int]
    val maxRounds: Int
    val rounds: Seq[Round]
}


abstract class Round {
    val lostBonus: Map[Team, Int]
    val strategies: Map[Team, Strategy]
    val playersRemaining: Map[Team, Seq[Player]]
    val money: Map[Team, Map[Player, Int]]

    val weapons: Map[Team, Map[Player, Seq[Weapon]]]
    val grenades: Map[Team, Map[Player, Seq[Grenade]]]

    val timeRemaining: Int
    val roundNumber: Int
    val bombPlanted: Boolean
    val bombTimer: Option[Int]
    val winningTeam: Team
}
