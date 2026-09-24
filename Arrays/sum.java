package Arrays;

public class sum {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int sum=0;
        int max=arr[0];
        int min=arr[0];
        int reverse=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];//running sum of array elements
        }
        System.out.println("Sum of array elements: "+sum);
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element in the array: "+max);
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element in the array: "+min);
        for(int i=arr.length-1;i>=0;i--){
            reverse=reverse*10+arr[i];
        }
        System.out.println("Reverse of the array: "+reverse);
  }
}