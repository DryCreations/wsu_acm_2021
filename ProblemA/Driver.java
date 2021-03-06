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
        .map(p -> String.join("", p.split(" ")).toLowerCase().contains(s) ? "eek" : "meh")
        .forEachOrdered(System.out::println);

        in.close();
    }
}