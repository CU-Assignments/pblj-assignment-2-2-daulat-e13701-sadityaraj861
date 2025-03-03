import java.util.ArrayList;
import java.util.List;

public class AutoboxingExample {
    
    // Method to parse a list of strings into a list of Integers
    public static List<Integer> parseStringListToIntegerList(String[] strNumbers) {
        List<Integer> intList = new ArrayList<>();
        for (String str : strNumbers) {
            intList.add(Integer.parseInt(str)); // Autoboxing from int to Integer
        }
        return intList;
    }

    // Method to calculate the sum of a list of Integers
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing from Integer to int
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example list of numbers in String format
        String[] numberStrings = {"10", "20", "30", "40", "50"};
        
        // Convert String array to List of Integers
        List<Integer> numbers = parseStringListToIntegerList(numberStrings);
        
        // Calculate sum
        int sum = calculateSum(numbers);
        
        // Display result
        System.out.println("The sum of the list is: " + sum);
    }
}
