package repro

import cats.Id
import cats.arrow.FunctionK

object GoodCodeRed {
  val idCalc: Calc[Id] = new Calc[Id] {
    override def add(lhs: Int, rhs: Int): Id[Int] = lhs + rhs
    override def subtract(lhs: Int, rhs: Int): Id[Int] = lhs - rhs
  }
  def fk: FunctionK[Calc.CalcOp, Id] =
    Calc.toFunctionK(idCalc)
}
