class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        HashSet<Integer>   set= new HashSet<>();
         int i =0,j=0;
        for(;i<nums.length;i++){
            if(nums[i]==val){
               
            }
            else{
                nums[j]=nums[i];
                j++;
            }
        }
        return j;

    }
}