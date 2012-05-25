/**
 * 3 Lang Dojo
 * User: stas
 * Date: 5/22/12
 */

object SortingListPuzzleS {
  def sortListOfLists[A <: Any](list: List[List[A]]) =
    list sortWith {
      _.length < _.length
    }
}
