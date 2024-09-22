package TddPracticeInJava;

public class StringCalculator {

    public int add(String input) {
        if (isEmptyInput(input)) {
            return 0;
        }

        String[] numbers = splitInput(input);
        return calculateSum(numbers);
    }

    private boolean isEmptyInput(String input) {
        return input.isEmpty();
    }

    private String[] splitInput(String input) {
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

    private String removeDelimiterHeader(String input) {
        return input.substring(input.indexOf("\n") + 1);
    }

    private int calculateSum(String[] numbers) {
        int sum = 0;
        for (String number : numbers) {
            int num = Integer.parseInt(number.trim());
            if (num <= 1000) {
                sum += num;
            }
        }
        return sum;
    }
}
