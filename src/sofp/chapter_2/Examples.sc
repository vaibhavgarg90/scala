/**
 * Chapter 2: Mathematical induction
 */

// an example of tuples
def tuple(t: (Int, (String, Int))): String = t match {
  case (x, (y, z)) => y + (x + z).toString
}
tuple(10, ("the result of 10 + 2 is ", 2))

val fruits: Map[String, Int] = Map("apples" -> 3, "oranges" -> 2, "pears" -> 0)
fruits.toSeq
fruits.map { case (_, count) => count * 2 }
fruits.map { case (_, count) => count * 2 }.sum
fruits.map { case (fruit, count) => (fruit, count * 2) }

fruits.
  map {
    case (fruit, count) => (fruit, count, count * 2)
  }.
  map { case (fruit, _, count_double) => (fruit, count_double / 2)
  }.
  toMap

val filtered: Map[String, Int] = fruits.filter {
  case (_, count) => count > 0
}
