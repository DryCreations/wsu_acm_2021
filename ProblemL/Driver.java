import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
         
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int w = in.nextInt();
            System.out.println(Arrays.toString(coven(w)));
        }

        in.close();
    }   

    public static float[] coven(int n) {
        boolean[][] m = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = in.next().equals("1");
            }
        }

        int[] depths = new int[n];
        float[] powers = new float[n];

        int root = 0;

        rec(root, m, n, depths, powers);

        return powers;
    }

    public static void rec(int i, boolean[][] m, int n, int[] depths, float[] powers) {
        for (int j = 0; j < n; j++) {
            if (m[i][j]) {
                int[] subDepths = new int[n];
                float[] subPowers = new float[n];

                rec(j, m, n, subDepths, subPowers);

                for (int k = 0; k < n; k++) {
                    if (subDepths[k] > 0) depths[k] = subDepths[k] + 1;
                    if (subPowers[k] > 0) powers[k] = subPowers[k];
                }
            } else if (j == i) {
                depths[j] = 1;
                powers[j] = 1;
            }
        }

        float power = 0;

        for (int j = 0; j < n; j++) {
            if (depths[j] > 0) {
                power += powers[j] / depths[j];
            }
        }

        powers[i] = power;
    }
}
