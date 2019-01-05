# Maximum sum subarray problem

Problem Statement:

Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
For example:
Given the array [-2,1,-3,4,-1,2,3,-7,4],
the contiguous subarray [4,-1,2,3] has the largest sum = 8.

Three scenarios:

1) Array may consists of only positive numbers
2) Array may consists of only negative numbers.
3) Array may consists of both positive and negative numbers (Kadane's Algorithm).


Kadane's Algorithm:

Steps:
Initialize : tempSum = 0, finalSum = 0
Loop through each element of array:
tempSum += a[ i ] 
if ( tempSum < 0 )
	tempSum = 0
if (  tempSum > finalSum )
	finalSum = tempSum
return finalSum
