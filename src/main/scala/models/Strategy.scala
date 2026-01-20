package src.main.scala.models

abstract class Strategy {
    val playerPositions: Map[Player, Position]
    val side: Boolean //false = T, true = CT (tbd if staying)
}