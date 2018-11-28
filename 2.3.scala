// 2.3: Implement -> def curry[A,B,C](f: (A, B) => C): A => (B => C)

def curry[A,B,C](f: (A, B) => C): A => (B => C) =
  return (a: A) => (b: B) => f(a, b)

val x = curry[Int,Int,Int]((a, b) => a+b)
println(x(30)(40))

