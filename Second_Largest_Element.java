public class Second_Largest_Element {
    
    public static void main(String[] args) {
       int[] arr={10,20,50,90,82};
        int large=arr[0];

        for(int i=1; i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        int secondlarge=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>secondlarge && arr[i]!=large){
                secondlarge=arr[i];
                
            }
        }
        System.out.print("Second Largest:"+ secondlarge);
    }
}

        