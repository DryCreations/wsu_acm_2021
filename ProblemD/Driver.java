import java.util.Scanner;
import java.util.stream.Stream;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        var m = Stream
            .iterate(new int[]{0, 0, z}, n -> n[1] < n[2], n -> new int[]{n[0] + 1, n[1] + x, n[2] + (int)(y * Math.pow(.9, n[0]))})
            .reduce((a, b) -> b).orElse(new int[3]);

        System.out.println(m[0]);

    }
}
