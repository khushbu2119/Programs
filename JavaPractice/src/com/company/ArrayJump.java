package com.company;

class ArrayJump {
    static int jump(int arr[], int first, int last) {
        if (last == first) {
            return 0;
        }

        if (arr[first] == 0) {
            return -1;
        }

        int min = arr.length;
        for (int i = first + 1; i <= last && i <= first + arr[first]; i++) {
            int jumps = jump(arr, i, last);
            if (jumps != arr.length && jumps + 1 < min) {
                min = jumps + 1;
            }
        }
        return min;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 4, 7, 9, 4, 2, 1, 5, 8, 6 };
        System.out.print("Minimum number of jumps to reach end is " + jump(arr, 0, arr.length - 1));
    }
}
