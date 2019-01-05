import java.util.Scanner;

public class MaxSumSubArrayProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfElements = sc.nextInt();
        int input[] = new int[numberOfElements];

        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        boolean allNegative = isAllNegative(input);

        if (allNegative)
            System.out.println(getNegativeResult(input));
        else
            System.out.println(getPositiveResult(input));

    }

    /*
    Kadane's Algorithm
     */
    private static int getPositiveResult(int[] input) {
        int tempSum = 0, finalSum = 0;
        for (int each : input) {
            tempSum += each;
            if (tempSum < 0)
                tempSum = 0;
            if (tempSum > finalSum)
                finalSum = tempSum;
        }
        return finalSum;
    }

    private static int getNegativeResult(int[] input) {
        int negativeResult = Integer.MIN_VALUE;
        for (int each : input)
            if (each > negativeResult)
                negativeResult = each;
        return negativeResult;
    }

    private static boolean isAllNegative(int[] inputArray) {
        for (int each : inputArray)
            if (each >= 0)
                return false;
        return true;
    }
}
/*
* According to kadane's algorithm, there must be atleast one positive number
*
* Time Complexity : O(n)
*
* TestCase:
* 9
* [-2 1 -3 4 -1 2 3 -7 4]
*output ==> 8
*
* 3
* [ -10 -107 -100 ] // If all negative number then pick the maximum number
*output ==> -10
*
*
* 3
* [ 12 7 153 ] // If all positive number then pick the maximum number
*output ==> 172
* */