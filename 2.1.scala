// 2.1: Write a recursive function to get the nth Fibonacci number

def fib(n: Int): Int = {
  def go(n: Int, leftOp: Int, rightOp: Int): Int = {
    if (n == 0) leftOp
    else go(n-1, rightOp, leftOp + rightOp) // leftOp.+(rightOp)
  }

  go(n, 0, 1)
}

def printLoop(n: Int): Unit = {
  def go(i: Int): Unit = {
    if (i < n) {
      println(fib(i))
      go(i+1)
    }
  }
  
  go(n-n)
}

printLoop(10)
