import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Driver {

    static Map<String, Integer> points = Map.ofEntries(
        Map.entry("Z", 1),
        Map.entry("M", 2),
        Map.entry("G", 4),
        Map.entry("V", 8),
        Map.entry("H", -10)
    );
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int c = in.nextInt();

        in.nextLine();

        String[] contestants = Stream
            .generate(in::nextLine)
            .limit(c)
            .toArray(String[]::new);

        var winner = Stream
            .of(contestants)
            .map(name -> {
                Contestant contestant = new Contestant();
                contestant.name = name;

                String kills = in.nextLine();

                Pattern p = Pattern.compile("(\\d+)(\\w)");
                Matcher m = p.matcher(kills);

                contestant.score = m
                    .results()
                    .map(kill -> {
                        int amt = Integer.parseInt(kill.group(1));
                        String t = kill.group(2);

                        return amt * points.get(t);
                    })
                    .reduce(0, (a, b) -> a + b);

                return contestant;

            })
            .max((a, b) -> a.score - b.score)
            .orElse(new Contestant());
        
        System.out.println(winner.name);

        in.close();
    }
           
}
class Contestant {
    public String name;
    public int score;
}