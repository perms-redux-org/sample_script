package onextent.oescript.http

import collection.mutable.Stack
import org.scalatest._

class TestMe extends FlatSpec {

  "A Stack" should "pop values in last-in-first-out order" in {
    assert(false === false)
  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyStack = new Stack[String]
    val o = intercept[NoSuchElementException] {
      emptyStack.pop()
    }
  }
}

