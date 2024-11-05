package Pawan;

import java.util.Arrays;
public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums) {
        /* In this array is passed as a copy of the Reference. Means nums and arr are copy of same object
           So changes in nums reflect back to original arr.
        * */
        nums[1] = 99;
        nums[2] = 101;
    }
}
