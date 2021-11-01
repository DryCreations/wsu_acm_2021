import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Stream;

public class Driver {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int n = in.nextInt();

        in.nextLine();

        Queue<String> lastK = new ArrayDeque<>();

        Stream.generate(in::nextLine).limit(n)
            .forEachOrdered(i -> {
                if (lastK.contains(i)) {
                    System.out.println(i + " is busted!");
                }

                lastK.add(i);

                if (lastK.size() > k) {
                    lastK.poll();
                }
            });
    }
}
