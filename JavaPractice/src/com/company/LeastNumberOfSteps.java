package com.company;

/*
Find the least number of steps necessary to reach the end of array.
a. For example, array is arr[]= {1,3,4,7,9,4,2,1,5,8,6}. If you are on arr[0]
and element value is 1, you can jump max 1 step. If you are on arr[1]
and element value is 3, you can jump max 3 steps reaching arr[4]. Find
the lowest number of steps needed to reach the end of array.
b. If you reach an element where the element value is 0, you cannot jump
to the next element.
c. If the end of array cannot be reached, return "–1".
*/

public class LeastNumberOfSteps {
    public static void main(String args[]) {
        int A[] = {1, 3, 4, 7, 9, 4, 2, 1, 5, 8, 6};
        int jumpCount = 0; // ans step count
        int e = 0;  // until where you can go in current jump
        int max = 0; // maximum we can go after every step.
        for (int i = 0; i < A.length - 1; i++) {
            max = Math.max(max, i + A[i]);
            if (i == e) {
                jumpCount++;
                e = max;
            }
        }
        System.out.println(jumpCount);
    }
}

/*
{1,3,4,7,9,4,2,1,5,8,6}
 0 1 2 3 4 5 6 7 8 9 10

          max   jumpCount   e
    0       1       1       1
    1       4       2       4
    2       6       2       4
    3      10       2       4
    4      13       3      13
    5
*/
