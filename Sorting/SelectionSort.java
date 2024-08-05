import java.util.*;

public class SelectionSort {
    public static void SelectionSort(int arr[], int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
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

       SelectionSort(arr,n);
       PrintArray(arr,n);
    }
}
