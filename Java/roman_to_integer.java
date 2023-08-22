import java.util.*;


class TestingSolution {
    public int characterToInt(String s) {

        HashMap<Character, Integer> charMap = new HashMap<>();
        charMap.put('I', 1);
        charMap.put('V', 5);
        charMap.put('X', 10);
        charMap.put('L', 50);
        charMap.put('C', 100);
        charMap.put('D', 500);
        charMap.put('M', 1000);

        int sum = 0;
        int prevValue = 0;

        //StringBuilder transformed = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int value = charMap.get(ch);

            // Check the special cases like IV, IX, XL, XC, CD, CM
            if (value > prevValue) {
                sum += value - 2 * prevValue;  // Subtract twice the previous value since it was added before
            } else {
                sum += value;
            }
            
            prevValue = value;
        }

        System.out.println("Original String: " + s);
        System.out.println("Converted to integer: " + sum);

        return sum;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        TestingSolution sol = new TestingSolution();
        System.out.println(sol.characterToInt(s));
    }
}