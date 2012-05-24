import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import ListToMapPuzzleS._

/**
 * 3 Lang Dojo
 * User: stas
 * Date: 5/21/12
 */
@RunWith(classOf[JUnitRunner])
class ListToMapTestS extends FunSuite {
  test("List from digits") {
    val expected = Map(
      3 -> List("one", "two", "six"),
      4 -> List("four", "five"),
      5 -> List("three"))
    val res = groupItemsBySize(List("one", "two", "three", "four", "five", "six"))

    assert(expected == res)
  }
}
