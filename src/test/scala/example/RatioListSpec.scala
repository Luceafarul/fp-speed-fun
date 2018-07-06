package example

import org.scalatest._
import example.Ratio._

class RatioListSpec extends FlatSpec with Matchers {
  "The Ratio lists" should "List(Ratio(2, 5), Ratio(2, 1)) and List(Ratio(2, 5), Ratio(2, 1)) be equals" in {
    Ratio.compare(List(Ratio(2, 5), Ratio(2, 1)), List(Ratio(2, 5), Ratio(2, 1))) shouldBe true
  }

  it should "List(Ratio(2, 2), Ratio(2, 4)) and List(Ratio(4, 4), Ratio(4, 8)) be equals" in {
    Ratio.compare(List(Ratio(2, 2), Ratio(2, 4)), List(Ratio(4, 4), Ratio(4, 8))) shouldBe true
  }

  it should "List(Ratio(2, 2), Ratio(2, 4)) and List(Ratio(1, 4), Ratio(4, 8)) not be equals" in {
    Ratio.compare(List(Ratio(2, 2), Ratio(2, 4)), List(Ratio(1, 4), Ratio(4, 8))) shouldBe false
  }

  it should "List(Ratio(2, 2)) and List(Ratio(4, 4), Ratio(4, 8)) not be equals" in {
    Ratio.compare(List(Ratio(2, 2)), List(Ratio(4, 4), Ratio(4, 8))) shouldBe false
  }

  it should "List() and List() be equals" in {
    Ratio.compare(List(), List()) shouldBe true
  }
}