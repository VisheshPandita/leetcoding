package org.example.problems;

public class P167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int ptr1=0,ptr2=numbers.length-1;
        while(ptr2>ptr1){
            if(numbers[ptr1]+numbers[ptr2]==target){
                ans[0] = ptr1+1;
                ans[1] = ptr2+1;

                return ans;
            }else if(numbers[ptr1]+numbers[ptr2]>target){
                ptr2--;
            }else{
                ptr1++;
            }
        }

        return ans;
    }
}
