import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import DoubleListPuzzleS._

/**
 * 3 Lang Dojo
 * User: stas
 * Date: 5/21/12
 */

@RunWith(classOf[JUnitRunner])
class DoubleListTestS extends FunSuite {
  test("Testing for 1 element") {
    assert(doubleAll(List('a')) == List('a', 'a'))
  }
}
