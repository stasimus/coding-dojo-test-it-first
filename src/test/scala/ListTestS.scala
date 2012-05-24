import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import ListPuzzleS._

/**
 * 3 Lang Dojo
 * User: stas
 * Date: 5/21/12
 */

@RunWith(classOf[JUnitRunner])
class ListTestS extends FunSuite {
  test("Parses succesfull variants") {
    val list1 = List(1, List('a, 'b), 2, 3)
    println(list1(10))

    assert(getSecondElementFromSecondElement(list1) == Some('b))
  }
}
