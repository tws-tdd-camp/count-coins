import com.github.underscore.$;

import java.util.*;

public class CentTransformer {

    public static List<List<Integer>> change(int cents) {
        List<List<Integer>> left = new ArrayList<>();
        int leftValue = 0;

        if(cents >= 25) {

            leftValue = 25;
            left.addAll(Arrays.asList(Arrays.asList(25)));
            left.addAll(mutiple(change(10), change(10), change(5)));

        } else if(cents >= 10) {

            leftValue = 10;
            left.addAll(Arrays.asList(Arrays.asList(10)));
            left.addAll(mutiple(change(5), change(5)));

        } else if(cents >= 5) {

            leftValue = 5;
            left.addAll(Arrays.asList(Arrays.asList(5)));
            left.addAll(mutiple(
                    change(1),
                    change(1),
                    change(1),
                    change(1),
                    change(1)
            ));

        } else if(cents >= 1) {

            leftValue = 1;
            left.addAll(Arrays.asList(Arrays.asList(1)));

        } else {

            return new ArrayList<>();
        }

        List<List<Integer>> results = mutiple(left, change(cents - leftValue));

        return sortAndUniq(results);
    }

    private static List<List<Integer>> sortAndUniq(List<List<Integer>> results) {
        for(List<Integer> result : results) {
            Collections.sort(result, (a, b) -> b - a);
        }

        return $.uniq(results);
    }

    static private List<List<Integer>> mutiple(List<List<Integer>>...args) {
        return Arrays.asList(args).stream().reduce((pre, cur)-> {


            if(cur.size() == 0) {
                return pre;
            }
            List<List<Integer>> result = new ArrayList<>();
            for(List<Integer>fItem : pre) {
                for(List<Integer> sItem : cur) {
                    List<Integer> item = new ArrayList<>();
                    item.addAll(fItem);
                    item.addAll(sItem);
                    result.add(item);
                }
            }
            return result;
        }).orElse(new ArrayList<>());
    }
}
