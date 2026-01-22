package src.main.scala.models

abstract class Strategy {
    val playerPositions: Map[Player, Position]
    val side: side //false = T, true = CT (tbd if staying)
}

trait side
trait tSide extends side
trait ctSide extends side