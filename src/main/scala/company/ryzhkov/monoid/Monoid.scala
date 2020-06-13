package company.ryzhkov.monoid

trait Monoid[A] {
  def mappend(x: A, y: A): A
}
