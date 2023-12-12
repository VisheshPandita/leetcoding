package org.example.problems;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class P128 {
    public int longestConsecutive(int[] nums) {
        int res=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: nums){
            if(!map.containsKey(n)){
                int left = map.getOrDefault(n - 1, 0);
                int right = map.getOrDefault(n + 1, 0);

                int sum  = left + right + 1;
                map.put(n, sum);

                res = Math.max(res, sum);

                map.put(n-left, sum);
                map.put(n+right, sum);
            }
        }

        return res;
    }
}
