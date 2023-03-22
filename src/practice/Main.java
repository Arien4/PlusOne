package practice;

// You are given a large integer represented as an integer array digits, where each digits[i]
// is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//
// Increment the large integer by one and return the resulting array of digits.

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

// Constraints:
// 1 <= digits.length <= 100
// 0 <= digits[i] <= 9
// digits does not contain any leading 0's.

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] digits = {9, 1};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
//        boolean all9 = Arrays.stream(digits).allMatch(i -> i == 9);
//        boolean all9 = true;
//        for (int digit : digits) {
//            if (digit < 9) {
//                all9 = false;
//                break;
//            }
//        }
        // It's slower using streams, but memory usage is slightly improved
        if (!Arrays.stream(digits).allMatch(i -> i == 9)) {
            int j = digits.length - 1;
            while (digits[j] == 9) {
                digits[j] = 0;
                j -= 1;
            }
            digits[j] += 1;
            return digits;

        } else {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }

    }
}
