package repro

import io.aecor.liberator.macros.algebra

import scala.concurrent.Future

@algebra('k)
trait Bad[F[_]] {
  def foo(k: String): F[Unit]
  def bar(k: String): F[Unit]
}

trait Good[F[_]] {
  def foo(k: String): F[Unit]
  def bar(k: String): F[Unit]
}

object Example {
  val bad: Bad[Future] = null
  bad.bar("1").map(_ => 1)

  val good: Good[Future] = null
  good.bar("1").map(_ => 1)
}
