import java.util.*;

public class InsertionSort {
    public static void InsertionSort(int arr[], int n){
        for(int i=0;i<n-1;i++){
            int j = i+1;
            while(j>=1 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
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
        InsertionSort(arr,n);
       PrintArray(arr,n);
    }
}
