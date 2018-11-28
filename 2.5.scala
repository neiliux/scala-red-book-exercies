// 2.5: Implement def compose[A,B,C](f: B => C, g: A => B): A => C

def compose[A,B,C](f: B => C, g: A => B): A => C =
  (v: A) => f(g(v))

val x = compose[Int,Int,Int](v => v+10, v => v)
println(x(20))

