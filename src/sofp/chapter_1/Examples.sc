/**
 * Chapter 1: Nameless functions
 */

// returns square of the given number n
def square(n: Int): Int = n * n
square(3)

// returns square root of the given number n
def square_root(n: Int): Double = Math.sqrt(n)
square_root(9)

// returns factorial of the given number n
def factorial(n: Int): Int = (1 to n).product
factorial(10)

// assignment of the factorial function to a variable
val factorialObj = (n: Int) => (1 to n).product
factorialObj
factorialObj(10)

// declare function without naming it
((n: Int) => (1 until n).product) (10)

// check whether a given number n is prime or not
def is_prime(n: Int): Boolean = (2 until n - 1).forall(k => n % k != 0)
is_prime(13)
is_prime(14)

// returns 1 if the given number is even, else 0
def is_even(n: Int): Int = n % 2 match {
  case 0 => 1
  case _ => 0
}
is_even(9)
is_even(10)

// counts the number of evens in the given s
def count_even(s: List[Int]): Int = s.map(is_even).sum
count_even(List(5, 6, 7, 8, 9, 10))

// counts the number of evens in the given s using filter method
def count_even_using_filter(s: List[Int]): Int = s.filter(k => k % 2 == 0).size
count_even_using_filter(List(5, 6, 7, 8, 9, 10))

// counts the number of evens in the given s using count method
def count_even_using_count(s: List[Int]): Int = s.count(k => k % 2 == 0)
count_even_using_count(List(5, 6, 7, 8, 9, 10))

// adds 20 to each item
def add_20(s: List[List[Int]]): List[List[Int]] = s.map(inner_s => inner_s.map(k => k + 20))
add_20(List(List(1), List(2, 3)))
