class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] nums2=new int[2*n];
        int left=0;
        int right=n;
        int i=0;
        while(left<n){
            nums2[left*2]=nums[left];
            nums2[2*i+1]=nums[right];
            left++;
            right++;
            i++;
        }
        return nums2;
        
    }
}