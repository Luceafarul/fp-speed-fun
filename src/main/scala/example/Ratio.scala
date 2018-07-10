package example

final case class Ratio(a: Int, b: Int)

object Ratio {
  implicit val ratioEq: Eq[Ratio] = (x: Ratio, y: Ratio) => x.a * y.b.toLong == x.b * y.a.toLong
}