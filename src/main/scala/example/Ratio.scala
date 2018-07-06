package example

final case class Ratio(a: Int, b: Int) {
  def ===(that: Ratio): Boolean = a * that.b == b * that.a
}

object Ratio {
  implicit val ratioEq: Eq[Ratio] = (x: Ratio, y: Ratio) => x.a * y.b == x.b * y.a
}