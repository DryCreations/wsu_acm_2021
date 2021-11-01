import java.util.Scanner;
import java.util.stream.Stream;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        double e = Stream.generate(() -> {
            int a = in.nextInt();
            int d = in.nextInt();

            return d * Math.sin(Math.toRadians(a));
        })
        .limit(n)
        .reduce(0d, (a, b) -> a + b);

        System.out.printf("%.2f", e);

        in.close();
    }    
}
