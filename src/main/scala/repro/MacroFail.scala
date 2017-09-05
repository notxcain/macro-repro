package repro

import io.aecor.liberator.macros.algebra

/*
  NOTE: If you remove `'k` from annotation it expands just fine.
 */

@algebra('k)
trait MacroFail[F[_]] {
  def foo(k: String): F[Unit]
  def bar(k: String): F[Unit]
}
