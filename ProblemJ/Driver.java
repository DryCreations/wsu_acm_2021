import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();
        in.nextLine();

        boolean[][] map = new boolean[m][n];

        for (int i = 0; i < map.length; i++) {
            char[] line = in.nextLine().toCharArray();
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = line[j] == '#';
            }
        }

        int count = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (!map[i][j]) {
                    count++;
                    fill(map, i, j);
                }
            }
        }

        System.out.println(count);

        in.close();
    }

    public static void fill(boolean[][] map, int i, int j) {
        if (i < 0) return;
        if (j < 0) return;
        if (i >= map.length) return;
        if (j >= map[i].length) return;
        if (map[i][j]) return;

        map[i][j] = true;

        fill(map, i + 1, j);
        fill(map, i, j + 1);
        fill(map, i - 1, j);
        fill(map, i, j - 1);
    }
}
