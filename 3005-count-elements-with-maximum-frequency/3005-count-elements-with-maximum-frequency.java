class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int maxFrequency=0;

        if(nums.length == 1){
            return 1;
        }

        
        for(int num:nums){
            //if(map.containsKey(num)){
            map.put(num,map.getOrDefault(num,0)+1);
                
                
        }
        
            // else{
            //     map.put(num,1)
                
                
            // }
        int max = 0;
        for(int num2 : map.values()){
            if(num2>max){
                max = num2;
            }
        }
        int ele =0;    
        for(int num1 : nums){
            if(map.get(num1)==max){
                ele ++;
            }
        }
        return ele ;
        
    }
}