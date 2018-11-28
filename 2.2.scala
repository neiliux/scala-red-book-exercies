// 2.2: Implement a function, which checks whether an Array[A] is sorted according to a given comparision function:
// (A, A) => Boolean

def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
  @annotation.tailrec
  def loop(i: Int, as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    if (i >= as.length) true
    else if (!ordered(as(i-1), as(i))) false
    else loop(i+1, as, ordered)
  }

  loop(1, as, ordered)
}

def asc(a: Int, b: Int): Boolean = a <= b;
def dsc(a: Int, b: Int): Boolean = a >= b;

val result = isSorted[Int](Array(1,2,2,3), asc);
println(result)

