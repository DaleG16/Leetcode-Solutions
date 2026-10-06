class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int missingnumber=0;
        boolean found=false;
        for(int i=0; i<=n; i++){
            found=false;
          for(int j=0; j<n; j++)
          {
            if(i==nums[j]){
                found=true;
                
            }
          }
          if(found==false){
            missingnumber=i;
            break;
          }

        }
        return missingnumber;
        
    }
}