package Arrays;

public class LC1480_Running_Sum_of_1D_Array {
    
    
    public int[] runningSum(int[] nums) {

        int runningSum = 0;

        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            nums[i] = runningSum;
        }

        return nums;
    }
  
}
