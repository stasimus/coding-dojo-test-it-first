/**
 * 3 Lang Dojo
 * User: stas
 * Date: 5/21/12
 */

object ListPuzzleS {
  def getSecondElementFromSecondElement[A](list: List[A]) = list match {
    case ss :: List(_, second, _*) :: _ => Some(second)
    case _ => None
  }
}
