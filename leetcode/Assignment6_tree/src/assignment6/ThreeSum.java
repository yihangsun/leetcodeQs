package assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
      if(nums.length < 3){
           return new ArrayList<>();
       }
       Arrays.sort(nums);
       HashMap<Integer,Integer> map = new HashMap<>();
       List<List<Integer>> resultarr = new ArrayList<>();
       for(int i = 0; i < nums.length; i++){
           map.put(nums[i],i);
       }
       Integer t;
       int target = 0;
       for(int i = 0; i < nums.length; ++i){            
            target = -nums[i];
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i + 1; j < nums.length; ++j){
                if(j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }             
                if((t = map.get(target - nums[j])) != null){
                    if(t > j){                      
                       resultarr.add(new ArrayList<>
                       (Arrays.asList(nums[i], nums[j], nums[t])));

                    } 
                    else{
                        break;
                    }                                                  
                }
            }
       }
       return resultarr;
    }
}
