package example

import org.scalatest._

class RatioSpec extends FlatSpec with Matchers {
  "The Ratio object" should "Ratio(2, 5) and Ratio(2, 5) be equals" in {
    Ratio(2, 5) === Ratio(2, 5) shouldBe true
  }

  it should "Ratio(1, 2) and Ratio(2, 4) be equals" in {
    Ratio(1, 2) === Ratio(2, 4) shouldBe true
  }

  it should "Ratio(3, 3) and Ratio(3, 6) not be equals" in {
    Ratio(3, 3) === Ratio(3, 6) shouldBe false
  }

  it should "Ratio(5, 7) and Ratio(8, 9) not be equals" in {
    Ratio(5, 7) === Ratio(8, 9) shouldBe false
  }
}
