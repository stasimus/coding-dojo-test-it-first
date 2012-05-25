/**
 * 3 Lang Dojo
 * User: stas
 * Date: 5/21/12
 */

object DoubleListPuzzleS {
  def doubleAll[A](list: List[A]) = {
    val start = List[A]()

    (list :\ start) {
      (element, res) => element :: element :: res
    }
  }
}
