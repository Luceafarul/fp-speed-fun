package example

import org.scalatest._
import example.Ratio._
import example.syntax.eq._

class RatioListSpec extends FlatSpec with Matchers {
  "The Ratio lists" should "List(Ratio(2, 5), Ratio(2, 1)) and List(Ratio(2, 5), Ratio(2, 1)) be equals" in {
    List(Ratio(2, 5), Ratio(2, 1)) req List(Ratio(2, 5), Ratio(2, 1)) shouldBe true
  }

  it should "List(Ratio(2, 2), Ratio(2, 4)) and List(Ratio(4, 4), Ratio(4, 8)) be equals" in {
    List(Ratio(2, 2), Ratio(2, 4)) req List(Ratio(4, 4), Ratio(4, 8)) shouldBe true
  }

  it should "List(Ratio(2, 2), Ratio(2, 4)) and List(Ratio(1, 4), Ratio(4, 8)) not be equals" in {
    List(Ratio(2, 2), Ratio(2, 4)) req List(Ratio(1, 4), Ratio(4, 8)) shouldBe false
  }

  it should "List(Ratio(2, 2)) and List(Ratio(4, 4), Ratio(4, 8)) not be equals" in {
    List(Ratio(2, 2)) req List(Ratio(4, 4), Ratio(4, 8)) shouldBe false
  }

  /*
   * This test not working with new syntax
  it should "List() and List() be equals" in {
    List() req List() shouldBe true
  }
  */
}