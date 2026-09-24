import java.util.Arrays;
class Reverse_Array{
    static void Reverse(int[] arr){
        if(arr==null || arr.length<=1){
            return;
        }
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
            
        }
    }
    public static void main(String args[]){

        int[] arr={10,20,30,40,50};
        System.out.println("Before Reverse:"+Arrays.toString(arr));
        Reverse(arr);
        System.out.print("After Reverse:"+Arrays.toString(arr));

    }
}