import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Stream;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        Deque<String> bag = new ArrayDeque<>();

        Stream.generate(in::nextLine).limit(n)
            .forEachOrdered(i -> {
                if (i.equals("eat")) {
                    bag.removeLast();
                } else {
                    bag.addLast(i);
                }
            });

        bag.stream().forEachOrdered(System.out::println);
    }
}
