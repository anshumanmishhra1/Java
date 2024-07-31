import java.util.*;

/*📌How to Initialise the Array and take input

public class LectureOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[] = new int[n]; //onw way
        int numbers[] {23,3,4}; //another wey
        for(int i=0;i<5;i++){
            marks[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(marks[i]);
        }
        
    }
}

*/

/*📌Passing Arrays as Argument
    // Array is paased by Reference 
    
    public class LectureOne {
        public static void update(int marks[]){
            for(int i=0;i<marks.length;i++){
                marks[i] = marks[i]+1;
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int marks[] = new int[10];
            for(int i=0;i<n;i++){
            marks[i] = sc.nextInt();
        }
        update(marks);
        for(int i=0;i<n;i++){
            System.out.println(marks[i]);
        }
        
    }
}

*/

/*📌Linear Search In Array : 
 

public class LectureOne {
    public static boolean search(int marks[], int target){
        boolean res = false;
        for(int i=0;i<marks.length;i++){
            if(marks[i]==target){
                res = true;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[] = new int[10];
        for(int i=0;i<5;i++){
            marks[i] = sc.nextInt();
        }
        int key = 12;
        
        boolean result = search(marks, key);
        
        if(result){
            System.out.println("Yes Present");
        }else{
            System.out.println("No Absent");
            
        }
        
    }
}

*/

/*📌Find Larget number in a given Array : 


public class LectureOne {
    public static int getLargest(int marks[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<marks.length;i++){
            if(marks[i]>largest){
                largest=marks[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[] = new int[10];
        for(int i=0;i<n;i++){
            marks[i] = sc.nextInt();
        }
        
        int res = getLargest(marks);
        System.out.println(res);
    }
}

*/

/*📌Pair in an Array
 

public class LectureOne {
    public static void pairs(int arr[]){
        int curr;
        for(int i=0;i<arr.length;i++){
            curr = i;
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + arr[curr] + ","  + arr[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        pairs(arr);
    }
}

*/


/*📌 Print Subarrays of the Arrays : 

public class LectureOne {
    public static void subArrays(int arr[]){
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<=arr.length;j++){
                for(int k=i;k<j;k++){
                    System.out.print(arr[k]);
                }
                System.out.print(" ");   
            }
        }
        System.out.print("\n");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        subArrays(arr);
    }
}
*/

//change kr diya maine bhai dubara kar diya fjdkfjdij