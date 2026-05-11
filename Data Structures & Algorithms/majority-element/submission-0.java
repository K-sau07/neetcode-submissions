class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;

        for(int i =0;i<nums.length;i++){
            int a=nums[i];
            if(!map.containsKey(nums[i])){
                map.put(nums[i],count);
            }
            map.put(nums[i],map.get(a)+1);
        }
        int max=-999999;
        int ans=nums[0];
        for(int value: map.keySet()){
            if(map.get(value)>max){
                max=map.get(value);
                ans=value;

            }
        } 

        return ans;


    }
}