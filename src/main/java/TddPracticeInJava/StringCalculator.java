package TddPracticeInJava;
package TddPracticeInJava;

public class StringCalculator {

    public int add(String numbers) {
        // Return 0 for empty input
        if (numbers.isEmpty()) {
            return 0;
        }

        // Handle custom delimiters
        String delimiter = ",|\n"; // Default delimiters: comma or newline
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 1);
        }

        // Split the numbers by the delimiter
        String[] tokens = numbers.split(delimiter);

        int sum = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                int number = Integer.parseInt(token);
                if (number <= 1000) { // Ignore numbers greater than 1000
                    sum += number;
                }
            }
        }

        return sum;
    }
}


