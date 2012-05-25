/**
 * 3 Lang Dojo
 * User: stas
 * Date: 5/21/12
 */

object ListToMapPuzzleS {
  def groupItemsBySize(list: List[String]) = {
    list groupBy (_ size)
  }
}
