import java.util.*;

public class BubbleSort {
    public static void BubbleSort(int arr[], int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void PrintArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
       int n;
       System.out.println("Enter the length of the Array : ");
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       int arr[]= new int[5];
       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
       }

       BubbleSort(arr,n);
       PrintArray(arr,n);
    }
}
