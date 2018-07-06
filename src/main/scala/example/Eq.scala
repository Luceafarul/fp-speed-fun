package example

trait Eq[T] {
	def ===(first: T, second: T): Boolean
}

object Eq {
  def compare[T](first: List[T], second: List[T])(f: Eq[T]): Boolean = {
    first.size == second.size && first.zip(second).forall {
      case (r1, r2) => f.===(r1, r2)
    }
  }
}