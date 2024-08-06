import java.util.*;

/*📌Initialization and Printing of Array : 

public class Introduction {
    public static void print(int arr[][], int m, int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("Enter the row of the array");
        m = sc.nextInt();
        n = sc.nextInt();
        
        int arr[][] = new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        print(arr, m, n);
    }
    
}

*/

/*📌Sum of two 2d Matrices :
 

public class Introduction {
    public static int [][] sum(int arr[][], int m, int n, int arr2[][], int r, int c){
        int res[][] = new int [m][n];
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j] = arr[i][j]+arr2[i][j];
            }
        }
        return res;
    }
    public static void print(int arr[][], int m, int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n,r,c;
        System.out.println("Enter first array no of elements");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Enter second array no of elements");
        r = sc.nextInt();
        c = sc.nextInt();
        int arr[][] = new int[m][n];
        int arr2[][] = new int [r][c];
        
        
        
        
        System.out.println("Enter elements of the array-1 : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter elements of the array-2 : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        
        
        int res[][]= sum(arr, m, n, arr2, r, c);
        System.out.print(res);
    }

}

*/


/*📌Multiplication of Two Arrays :  

public class Introduction {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m,n,r,c;
    System.out.println("Enter the row and column of first Array : ");
    m = sc.nextInt();
    n = sc.nextInt();
    
    System.out.println("Enter the row and column of the second Array : ");
    r = sc.nextInt();
    c = sc.nextInt();
    
    int arr1[][] = new int[m][n];
    int arr2[][] = new int[r][c];
    
    System.out.println("Enter the elements of ther Array-1 ");
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr1[i][j]= sc.nextInt();
        }
    }
    
    System.out.println("Enter the elements of ther Array-2 ");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            arr2[i][j]= sc.nextInt();
        }
    }
    
    //multiplication of two matrices
    int res[][] = new int [m][c];
    
    for(int i=0;i<m;i++){
        for(int j=0;j<c;j++){
            for(int k=0;k<n;k++){
                res[i][j] += arr1[i][k]*arr2[k][j];
            }
        }
    }
}
}


*/


/*📌Transpose of A 2D Matrices : 

*/


// public class Introduction {

//     public static void print(int arr[][], int m, int n){
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static int[][] findTranspose(int arr[][], int m, int n){
//         int ans [][] = new int[n][m];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 ans[i][j] = arr[j][i];
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int m,n;
//         System.out.println("Enter the row and column of first Array : ");
//         m = sc.nextInt();
//         n = sc.nextInt();

//         int arr1[][] = new int[m][n];

//         System.out.println("Enter the elements of ther Array-1 ");
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 arr1[i][j]= sc.nextInt();
//             }
//         }

//         int trans [][]= findTranspose(arr1, m, n);
//         print(trans, n, m);   
//     }
// }


/*📌Rotate 90deg of A 2D Matrices : 



public class Introduction {
    
public static void print(int arr[][], int m, int n){
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}
public static void findTranspose(int arr[][], int m, int n){
    for(int i=0;i<n;i++){
        reverseArray(arr[]);
    }
}

public static void reverseArray(int arr[]){
    int i = 0;
    int j= arr.length-1;
    while (i>j) {
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
}
public static int[][] rotate(int arr[][], int m, int n){
    int ans [][] = new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            ans[i][j] = arr[j][i];
        }
    }
    return ans;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m,n;
    System.out.println("Enter the row and column of first Array : ");
    m = sc.nextInt();
    n = sc.nextInt();
    
    int arr1[][] = new int[m][n];
    
    System.out.println("Enter the elements of ther Array-1 ");
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr1[i][j]= sc.nextInt();
        }
    }
    
    int trans [][]= findTranspose(arr1, m, n);
    print(trans, n, m);   
}
}
*/