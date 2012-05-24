import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import SortingListPuzzleS.sortListOfLists

/**
 * 3 Lang Dojo
 * User: stas
 * Date: 5/22/12
 */
@RunWith(classOf[JUnitRunner])
class SortingListTestS extends FunSuite {
  test("Sortin list of 3 elements") {
    val in = List(List('a, 'b, 'c, 'd), List( 'a, 'b, 'c, 'd, 'e), List('a) )

    val out = sortListOfLists(in)

    assert(out == List(List('a), List('a, 'b, 'c, 'd), List( 'a, 'b, 'c, 'd, 'e) ) )
  }
}
