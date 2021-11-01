import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        Stream
            .generate(in::nextLine)
            .limit(n)
            .map(Driver::chainReaction)
            .forEachOrdered(System.out::println);

        in.close();
    }

    public static Long chainReaction(String s) {
        var e = s.chars()
            .mapToObj(i -> (char) i)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        e.putIfAbsent('C', 0L);
        e.putIfAbsent('K', 0L);
        e.putIfAbsent('R', 0L);
        e.putIfAbsent('S', 0L);

        boolean flag;

        do {
            flag = false;

            flag |= execRule(e, 'C', 5, 'K', 2);
            flag |= execRule(e, 'K', 4, 'R', 2);
            flag |= execRule(e, 'R', 3, 'S', 2);

        } while (flag);

        return e.entrySet().stream().map(Entry::getValue).reduce(0L,(a, b) -> a + b);
    }

    public static boolean execRule(Map<Character, Long> e, char i, long iAmt, char j, long jAmt) {
        if (e.get(i) >= iAmt) {
            e.compute(j, (key, val) -> val + jAmt * (e.get(i) / iAmt));
            e.compute(i, (key, val) -> val % iAmt);
            return true;
        }
        return false;
    }
}
