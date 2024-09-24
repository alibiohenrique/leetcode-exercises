package beginners_guide.fizz_buzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(i + "");
            }

        }
        return result;
    }
}

class Program {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fizzBuzz(3));
    }
}
