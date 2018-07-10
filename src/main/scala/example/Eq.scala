package example

trait Eq[T] {
	def ===(first: T, second: T): Boolean
}

object Eq {
  import example.syntax.eq._

  implicit def compare[T](implicit eq: Eq[T]): Eq[List[T]] = {
    (first: List[T], second: List[T]) => first.size == second.size && first.zip(second).forall {
      case (r1, r2) => r1 req r2
    }
  }
}