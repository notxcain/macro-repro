package repro

import io.aecor.liberator.macros.algebra

@algebra('k)
trait MacroFail[F[_]] {
  def foo(k: String): F[Unit]
  def bar(k: String): F[Unit]
}
