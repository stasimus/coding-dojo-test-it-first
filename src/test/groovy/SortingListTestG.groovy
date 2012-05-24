/**
 * 3 Lang Dojo
 * User: stas
 * Date: 5/23/12
 */
class SortingListTestG extends GroovyTestCase {
    void testSomething() {
        def sorted = SortingListPuzzleG.sortListOfLists([[1,2,3], [1], [1, 2]])
        assert sorted == [[1], [1, 2], [1,2,3]]
    }
}