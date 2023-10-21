
import java.util.*;

public class RomanToInteger {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = romanValues.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i + 1))) {
                result -= romanValues.get(s.charAt(i));
            } else {
                result += romanValues.get(s.charAt(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your Roman choice: ");
        String romanNumeral = sc.next(); 
        int intValue = romanToInt(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equivalent to " + intValue);
    }
}
