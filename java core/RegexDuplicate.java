import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDuplicate {

    public static void main(String[] args) {

        // 1. Write a RegEx that will match any repeated word.
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        
        // 2. Complete the second compile argument so that the compiled RegEx is case-insensitive.
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // 3. Write the two necessary arguments for replaceAll.
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
