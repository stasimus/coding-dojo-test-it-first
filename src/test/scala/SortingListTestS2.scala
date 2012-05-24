import SortingListPuzzleS._
import org.junit._
import org.specs2.matcher._

/**
 * 3 Lang Dojo
 * User: stas
 * Date: 5/22/12
 */
class SortingListTestS2 extends JUnitMustMatchers {
  @Test
  def test3Elements() {
    val in = List(List('a, 'b, 'c, 'd), List('a, 'b, 'c, 'd, 'e), List('a))

    val out = sortListOfLists(in)

    assert(out == List(List('a), List('a, 'b, 'c, 'd), List('a, 'b, 'c, 'd, 'e)))
  }
}
