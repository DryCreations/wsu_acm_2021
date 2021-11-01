import java.util.Scanner;

public class Driver {

    static final char WALL = '#';
    static final char FLOOR = '.';
    static final char VISITED = 'v';
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();
        in.nextLine();

        char[][] map = new char[m][];

        for (int i = 0; i < map.length; i++) {
            map[i] = in.nextLine().toCharArray();
        }

        boolean valid = isValid(map);

        System.out.println(valid ? "valid" : "invalid");

        in.close();
    }   

    public static boolean isValid(char[][] map) {
        boolean flag = false;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == WALL) {
                    if (flag) return false;

                    map[i][j] = VISITED;

                    if (countNeighbors(map, i, j, WALL) == 2) {
                        int[] pos = getNeighbor(map, i, j, WALL);
                        if (!rec(map, pos[0], pos[1])) {
                            return false;
                        }
                    } else {
                        return false;
                    }

                    flag = true;
                }
            }
        }

        return true;
    }

    public static boolean rec(char[][] map, int i, int j) {
        int walls = countNeighbors(map, i, j, WALL);
        int visited = countNeighbors(map, i, j, VISITED);

        map[i][j] = VISITED;

        if (walls == 1 && visited == 1) {
            int[] pos = getNeighbor(map, i, j, WALL);
            if (!rec(map, pos[0], pos[1])) {
                return false;
            }
        } else if (walls == 0 && visited == 2) {
            return true;
        } else {
            return false;
        }

        return true;
    }

    public static int countNeighbors(char[][] map, int i, int j, char t) {
        int count = 0;

        boolean top = i > 0;
        boolean bottom = i < map.length - 1;
        boolean left = j > 0;
        boolean right = j < map[i].length - 1;

        if (bottom && right && map[i + 1][j + 1] == t)  count++;
        if (bottom && map[i + 1][j] == t)               count++;
        if (right && map[i][j + 1] == t)                count++;
        if (top && left && map[i - 1][j - 1] == t)      count++;
        if (top && map[i - 1][j] == t)                  count++;
        if (left && map[i][j - 1] == t)                 count++;
        if (bottom && left && map[i + 1][j - 1] == t)   count++;
        if (top && right && map[i - 1][j + 1] == t)     count++;
        
        return count;
    }

    public static int[] getNeighbor(char[][] map, int i , int j, char t) {
        boolean top = i > 0;
        boolean bottom = i < map.length - 1;
        boolean left = j > 0;
        boolean right = j < map[i].length - 1;

        if (bottom && right && map[i + 1][j + 1] == t)  return new int[]{i + 1, j + 1};
        if (bottom && map[i + 1][j] == t)               return new int[]{i + 1, j};
        if (right && map[i][j + 1] == t)                return new int[]{i, j + 1};
        if (top && left && map[i - 1][j - 1] == t)      return new int[]{i - 1, j - 1};
        if (top && map[i - 1][j] == t)                  return new int[]{i - 1, j};
        if (left && map[i][j - 1] == t)                 return new int[]{i, j - 1};
        if (bottom && left && map[i + 1][j - 1] == t)   return new int[]{i + 1, j - 1};
        if (top && right && map[i - 1][j + 1] == t)     return new int[]{i - 1, j + 1};

        return new int[]{i, j};
    }
}
