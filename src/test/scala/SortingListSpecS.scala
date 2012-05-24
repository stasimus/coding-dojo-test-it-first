import org.specs2.mutable.Specification
import SortingListPuzzleS.sortListOfLists

/**
 * 3 Lang Dojo
 * User: stas
 * Date: 5/22/12
 */

class SortingListSpecS extends Specification {
  "sortListOfLists" should {
    "sort list of 3 elements" in {
      val in = List(List('a, 'b, 'c, 'd), List('a, 'b, 'c, 'd, 'e), List('a))
      sortListOfLists(in) must be equalTo List(List('a), List('a, 'b, 'c, 'd), List('a, 'b, 'c, 'd, 'e))
    }
  }
}
