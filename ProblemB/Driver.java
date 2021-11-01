import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        Entry<String, Long> test = Stream
            .generate(in::nextLine)
            .limit(n)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .max(Entry.comparingByValue())
            .orElseThrow(NoSuchElementException::new);

        System.out.println(test.getKey());

        in.close();
    }    
}
