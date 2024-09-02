import java.util.*;

public class PrefixSum {
    public static void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] prefixSum(int arr[], int n){
        int pref [] = new int[n];
        pref[0]  = arr[0];
        for(int i=1;i<n;i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int res[] = prefixSum(arr, n);
        printArray(res,n);

    }
}
