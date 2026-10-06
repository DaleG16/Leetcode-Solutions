import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int missingnumber=0;
        for(int i=0; i<n; i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return n;
    }
        
    
}