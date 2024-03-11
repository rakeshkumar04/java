import java.util.*;
import java.util.regex.*;

public class TagContentRegex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {
            String line = in.nextLine();
            extractAndPrintContent(line);
            testCases--;
        }
        in.close();
    }

    // Method to extract and print content within valid tags
    private static void extractAndPrintContent(String line) {
        // Define the regular expression pattern for valid tags and content
        String pattern = "<(.+?)>([^<>]+)</\\1>";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);

        boolean found = false;

        // Iterate through the matches and print the content
        while (m.find()) {
            System.out.println(m.group(2));
            found = true;
        }

        // If no valid content is found, print None
        if (!found) {
            System.out.println("None");
        }
    }
}
