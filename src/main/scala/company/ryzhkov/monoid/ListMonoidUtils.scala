package company.ryzhkov.monoid

object ListMonoidUtils {

  implicit def listMonoid[A]: Monoid[List[A]] =
    (x: List[A], y: List[A]) => x ::: y

  def empty[A]: List[A] = Nil

  implicit class ListStringMonoidImplicit[A](that: List[A]) {
    val F: Monoid[List[A]] = implicitly[Monoid[List[A]]]

    def mappend(y: List[A]): List[A] = F.mappend(that, y)
  }
}
