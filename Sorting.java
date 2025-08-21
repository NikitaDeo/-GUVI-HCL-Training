package Tday_program;
import java.util.Arrays;

public class Selection_sor {
    public static void main(String[] args) {
        int arr[]={9,0,8,78,4,3,7};
        System.out.println(Arrays.toString(Sort(arr)));

    }
    public static int[] Sort(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            int end=arr.length-i-1;
            int max=getMaxIndex(arr,0,end);
            swap(arr, max, end);
        }
        return arr;
    }
    public static int getMaxIndex(int[] arr,int start, int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;   
    }
    public static void swap(int[] arr,int a ,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }    
}
