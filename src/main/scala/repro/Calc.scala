package repro
import io.aecor.liberator.macros.algebra

@algebra
trait Calc[F[_]] {
  def add(lhs: Int, rhs: Int): F[Int]
  def subtract(lhs: Int, rhs: Int): F[Int]
}
