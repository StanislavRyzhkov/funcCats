package company.ryzhkov

import company.ryzhkov.monoid.ListMonoidUtils.{ListStringMonoidImplicit, empty}

object Application extends App {
  val list3 = empty mappend List("A", "B") mappend empty mappend List(
    "C",
    "D",
    "F"
  )

  println(list3)

  val list2 = empty mappend List(1, 2, 3) mappend List(5, 6)

  println(list2)
}
