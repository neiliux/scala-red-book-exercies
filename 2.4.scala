// 2.4: Implement def uncurry[A,B,C](f: A => B => C): (A, B) => C

def uncurry[A,B,C](f: A => B => C): (A, B) => C =
  (a: A, b: B) => f(a)(b)

val x = uncurry[Int,Int,Int]((a: Int) => (b: Int) => a+b)
println(x(30, 40))

