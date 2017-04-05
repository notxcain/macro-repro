package repro
import io.aecor.liberator.macros.algebra

@algebra
trait Adder[F[_]] {
  def add(lhs: Int, rhs: Int): F[Int]
}

object Foo {
  Adder.AdderOp.Add(1, 2)
}
