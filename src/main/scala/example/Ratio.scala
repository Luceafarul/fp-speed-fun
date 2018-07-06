package example

final case class Ratio(a: Int, b: Int) {
  def ===(that: Ratio): Boolean = a * that.b == b * that.a
}

object Ratio {
  def compare(first: List[Ratio], second: List[Ratio]): Boolean = {
    first.size == second.size && first.zip(second).forall {
      case (r1, r2) => r1 === r2
    }
  }
}