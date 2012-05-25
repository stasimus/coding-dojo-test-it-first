import java.util.List;

/**
 * 3 Lang Dojo
 * User: stas
 * Date: 5/21/12
 */
public class ListPuzzleJ {

    private static final int POSITION = 2;
    private static final int SUB_POSITION = 2;

    public static Object getSecondElementFromSecondElement(List<?> list) {
        if (list.size() < POSITION)
            return null;

        return extractSecondElement(getSubList(list));
    }

    private static Object extractSecondElement(List<?> subList) {
        return subList != null && subList.size() >= SUB_POSITION ? subList.get(SUB_POSITION - 1) : null;
    }

    private static List<?> getSubList(List<?> list) {
        Object secondElem = list.get(POSITION - 1);

        return secondElem instanceof List<?> ? (List<?>) secondElem : null;
    }
}
