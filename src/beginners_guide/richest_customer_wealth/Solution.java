package beginners_guide.richest_customer_wealth;

class Solution {
    public static int maximumWealth(int[][] accounts) {

        int richest = 0;

        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
            }
            richest = richest > sum ? richest : sum;
        }
        return richest;
    }

    public static void main(String[] args) {

        int[][] accounts = new int[][]{{3, 2, 1}, {1, 2, 3}};
        System.out.println(maximumWealth(accounts));
    }
}