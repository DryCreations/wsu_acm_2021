import java.util.Scanner;
import java.util.stream.Stream;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Stream
            .generate(in::nextInt)
            .limit(n)
            .map(Driver::scores)
            .forEach(System.out::println);

        in.close();
    }   

    public static int scores(int score) {
        if (score == 0) return 1;
        if (score < 0) return 0;

        return scores(score - 3) + scores(score - 7);
    }
}
