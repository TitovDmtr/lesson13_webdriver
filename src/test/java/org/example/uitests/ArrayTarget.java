package org.example.uitests;

public class ArrayTarget {
    public static void main(String[] args) {
//        Example 1:
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        int[] array = {2,7,11,15};
        int target = 9;
        int n = array.length;
        boolean flag = false;

        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if ( array[i] + array[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                    flag = true;
                    break;
                }
            }
        }
        if ( !flag ) {
            System.out.println("There are not such numbers");
        }
    }
}