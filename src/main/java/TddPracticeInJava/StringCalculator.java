package TddPracticeInJava;

import java.util.Arrays; 
import java.util.List;  

public class StringCalculator {

    public int getSumOfTheNumbers(String input) {
        if (isEmptyInput(input)) {
            return 0;
        }
        String[] numbers = splitTheInput(input);
        return findSum(numbers);
    }

    private boolean isEmptyInput(String input) { 
        return input.isEmpty() || input == null;
    }

    private String[] splitTheInput(String input) {
        String delimiter = ",|\n";
        if (input.startsWith("//")) {
            delimiter = extractCustomDelimiter(input);
            input = removeDelimiterHeader(input);
        }
        return input.split(delimiter);
    }

    private String extractCustomDelimiter(String input) {
        return input.substring(2, input.indexOf("\n"));
    }

   private String removeDelimiterPrefix(String input) {
        return input.substring(input.indexOf("\n") + 1);
    }

    private int findSum(String[] numbers) {
        int sum = 0;
        for (String number : numbers) {
            int num = Integer.parseInt(number.trim());
            if (!isIgnoreString(num)) {
                sum += num;
            }
        }
        return sum;
    }

    private boolean isIgnoreString(int num) {
        List<Integer> ignoreNumberList = Arrays.asList(1001);  // Add more ignore numbers if needed
        for (int ignoreNum : ignoreNumberList) {
            if (num >= ignoreNum) {
                return true;
            }
        }
        return false;
    }
}
