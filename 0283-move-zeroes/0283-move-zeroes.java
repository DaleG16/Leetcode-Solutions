class Solution {
    public void moveZeroes(int[] nums) {
       int nz=0;
       int temp=0;
       int z=0;
       if(nums.length<1){
        return;
       }
       for(nz=0; nz<nums.length; nz++){
        if(nums[nz]!=0){
            temp=nums[z];
            nums[z]=nums[nz];
            nums[nz]=temp;
            z++;
        }
       }
        
    }
}