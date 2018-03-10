import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CentTransformer {
    public static List<List<String>> transform(int cent) {
        if (cent == 0) {
            return new ArrayList();
        }

        List<List<String>> result = new ArrayList<>();
        int left = 0;

        if (cent >= 10) {
            left = 10;
            result.add(Arrays.asList("dime"));
            result.add(Arrays.asList("nickel", "nickel"));
            result.add(Arrays.asList("nickel", "penny", "penny", "penny", "penny", "penny"));
            result.add(Arrays.asList("penny", "penny", "penny", "penny", "penny", "penny", "penny", "penny", "penny", "penny"));
        } else if (cent >= 5) {
            left = 5;
            result.add(Arrays.asList("nickel"));

            List<String> temp = new ArrayList<>();
            temp.add("penny");
            temp.add("penny");
            temp.add("penny");
            temp.add("penny");
            temp.add("penny");
            result.add(temp);

        } else if (cent >= 1) {
            left = 1;
            result.add(Arrays.asList("penny"));
        }

        return multiple(result, transform(cent - left));
    }

    private static List<List<String>> multiple(List<List<String>> first, List<List<String>> second) {
        if (second == null || second.size() == 0) {
            return first;
        }

        List<List<String>> result = new ArrayList<>();

        for (List<String> aFirst : first) {
            for (List<String> aSecond : second) {
                result.add(concatTwoList(aFirst, aSecond));
            }
        }

        return result;
    }

    private static List<String> concatTwoList(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>();

        result.addAll(first);
        result.addAll(second);

        return result;
    }
}
