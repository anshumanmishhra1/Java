import java.util.*;

// public class basic {
//     public static void printHello(){
//         System.out.println("jai siya ram");
//     }
//     public static void main(String[] args) {
//         System.out.println("hello");
//         printHello();
//         printHello();
//         printHello();
//         printHello();
//     }
// }


// public class basic{
//     public static int sum(int a , int b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int result = sum(a,b);
//         System.out.print("The sum of A and B is " + result);
//     }
// }


// import java.util.*;
// public class basic{
//     public static int product(int a , int b){
//         return a*b;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int res = product(a,b);
//         System.out.println(res);
//     }



// import java.util.*;
// public class basic{
//     public static int factorial(int a){
//         int product = 1;
//         for(int i=1;i<=a;i++){
//             product*=i;
//         }
//         return product;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int res = factorial(a);
//         System.out.println(res);
//     }
// }



// public class basic{
//     public static int factorial(int a){
//         int product = 1;
//         for(int i=1;i<=a;i++){
//             product*=i;
//         }
//         return product;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int res1 = factorial(a);
//         int rem = a-b;
//         int res2 = factorial(rem);
//         int res3 = factorial(b);
//         int res = (res1)/(res2*res3);
//         System.out.println(res);
//     }
// }


/*📌Conver From Binary to Decimal


public class basic{
    public static int BinaryToDecimal(int a){
        int pow = 0;
        int decNum = 0;
        while(a>0){
            int lastDigit = a%10;
            decNum += (lastDigit * (int)(Math.pow(2,pow)));
            a/=10;
            pow++;
        }
        return decNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = BinaryToDecimal(a);
        System.out.println(res);
    }
}

*/




/*📌Conver From Decimal to Binary */

// public class basic{
//     public static int DeimalToBinary(int a){

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int res = DeimalToBinary(a);
//         System.out.println(res);
//     }
// }