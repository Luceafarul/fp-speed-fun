package example

final case class Ratio(a: Int, b: Int) {
  def ===(that: Ratio): Boolean = a * that.b == b * that.a
}
