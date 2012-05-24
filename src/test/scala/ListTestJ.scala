import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
 * 3 Lang Dojo
 * User: stas
 * Date: 5/21/12
 */

@RunWith(classOf[JUnitRunner])
class ListTestJ extends FunSuite {
  test("Parses succesfull variants") {
    val list1: java.util.ArrayList[Object] = new java.util.ArrayList[Object]()
    list1.add(1: java.lang.Integer)
    list1.add(createInternalList)
    list1.add(2: java.lang.Integer)

    assert(ListPuzzleJ.getSecondElementFromSecondElement(list1) == 'b')
  }

  private def createInternalList = {
    val res = new java.util.ArrayList[Object]()
    res.add('a': java.lang.Character)
    res.add('b': java.lang.Character)

    res
  }
}
