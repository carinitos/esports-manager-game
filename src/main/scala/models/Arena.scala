package src.main.scala.models

abstract class Arena {
    val name: String

    val ctSideEffect: Double
    val tSideEffect: Double

    val positions: Seq[Position]

    val commonStrategies: Seq[Strategy]
    val teamsPickRate: Map[Team, Double]
}

abstract class Position