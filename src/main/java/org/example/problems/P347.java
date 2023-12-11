package org.example.problems;

import java.util.*;
import java.util.stream.Collectors;

public class P347 {
    public int[] topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for(int n: nums){
            frequencyMap.put(n, frequencyMap.getOrDefault(n,0)+1);
        }

        for(int key: frequencyMap.keySet()){
            int frequency = frequencyMap.get(key);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int[] res = new int[k];
        int j=0;

        for(int pos= bucket.length-1;pos>=0 && j<k;pos--){
            if(bucket[pos]!=null){
                for(int i: bucket[pos]){
                    res[j] = i;
                    j++;
                }
            }
        }

        return res;
    }
}
