import java.util.Scanner;
import java.util.stream.Stream;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        String s = in.nextLine().toLowerCase();

        Stream.generate(in::nextLine)
        .limit(n - 1)
        .map(p -> String.join("", p.split(" ")).toLowerCase())
        .forEachOrdered(p -> {
            if (p.contains(s)) {
                System.out.println("eek");
            } else {
                System.out.println("meh");
            }
        });

        in.close();
    }
}