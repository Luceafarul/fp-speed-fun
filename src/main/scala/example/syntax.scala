package example

object syntax {
  object eq {
    implicit class EqOps[T](val x: T) extends AnyVal {
      def req(y: T)(implicit f: Eq[T]): Boolean = f.===(x, y)
    }
  }
}