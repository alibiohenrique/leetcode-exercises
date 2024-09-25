package beginners_guide.steps_reduce_to_0;

public class Solution {
    public int numberOfSteps(int num) {
        int numbemOfSteps = 0;

        while (num != 0) {
            if (!isEven(num)) {
                num -= 1;
                numbemOfSteps++;
            } else if (isEven(num)) {

                num /= 2;
                numbemOfSteps++;
            }
        }

        return numbemOfSteps;

    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberOfSteps(14));
    }
}
