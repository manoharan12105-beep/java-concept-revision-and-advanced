/*
  Leetcode Problem : 2180. Count Integers With Even Digit Sum
  
  https://leetcode.com/problems/count-integers-with-even-digit-sum/description/
*/

class Solution {
    public int countEven(int num) {
        long count = IntStream.rangeClosed(1, num)
                              .filter(n -> digitSum(n) % 2 == 0)
                              .count();
        
        return (int) count;
    }

    private static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}






