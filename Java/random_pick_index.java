import java.util.*;



class Solution {
    
    Map<Integer, List<Integer>> map; // key: value, value: list of indices
    Random rand; // random number generator



    public Solution(int[] nums) { 
        map = new HashMap<>(); // key: value, value: list of indices
        rand = new Random(); // random number generator
        List<Integer> list; // list of indices
        for (int i = 0; i < nums.length; i++) { // iterate through nums
            list = map.getOrDefault(nums[i], new ArrayList<>()); // get list of indices for nums[i]
            list.add(i); // add current index to list
            map.put(nums[i], list); // update map
        }
        
    }

    public int pick(int target) { // return random index of target
        List<Integer> list = map.get(target); // get list of indices for target
        return list.get(rand.nextInt(list.size())); // return random index
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,6,3,4,3,5,3,3}; // input array
        
        

        Solution s = new Solution(nums); // create solution object
        System.out.println(s.pick(3)); // print random index of 3
    }
}
