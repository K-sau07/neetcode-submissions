class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int [] result= new int[2];
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
              map.put(nums[i],i);
            }
            
        }
         int ans;
        for(int i=0;i<nums.length;i++){
           ans=target-nums[i];
           if(map.containsKey(ans)&& map.get(ans) != i){
              result[0]=map.get(ans);
              result[1]=i;
              
           }
        }
        return result;
    }
}
