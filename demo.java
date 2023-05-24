// Sample regex pattern finding program
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter the regex pattern: ");
                String regexP = sc.nextLine();
                Pattern pattern = Pattern.compile(regexP);
                Matcher matcher = pattern.matcher("welcome to my demo code haha !!");
                boolean found = false;
                while (matcher.find()) {
                    System.out.println("found the text " + matcher.group() + ", the starting index is " + matcher.start() + " and the ending index of the matched pattern is: " + matcher.end());
                    found = true;
                }
                if (!found) {
                    System.out.println("Match not found");
                }
            }
        }
    }
}
