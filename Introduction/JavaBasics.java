// public class JavaBasics{
//     public static void main(String args[]){
//         System.out.println("hello world");
//         System.out.println("hello world");
//         System.out.println("hello world");
//     }
// }

/*📌Print Pattern : 

public class JavaBasics{
    public static void main(String[] args) {
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
}

 */

/*📌Variables in Java
    primitive : int, short, byte, char, boolean, float, long, double
    Non-primitive : class, object, Array

    byte = 1 byte [-128 to 127]
    short = 2 bytes
    char = 2 bytes
    boolan = 1 byte
    int =  4 bytes
    long = 8 bytes
    float = 4 bytes
    double = 8 bytes

 */


 /*📌Sum of A and B 
 public class JavaBasics {
 
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c= a + b;
        System.out.println(a+b);
        System.out.println(c);
    }
 }

 */

/*📍Taking Input In Java from the user  

import java.util.*;

class JavaBasics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);
        String name = sc.nextLine();
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);
    }
}

*/

/*📌Two Sum using User Inputs : 
 

 import java.util.*;


  JavaBasics
 public class JavaBasics {
 
    public static void main(String args[]){
        System.out.println("Enter First Number : \n");
        Scanner sc = new Scanner(System.in);
        int Number1 = sc.nextInt();
        int Number2 = sc.nextInt();
        int number3 = Number1+Number2;
        System.out.println(number3);
    }
 }

 */


 /*📌Multiplication of Two Numbers 
 import java.util.*;

 public class JavaBasics {
 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c= a*b;
        System.out.println(c);
    }
 }

 */

 /*📌Type Casting in java or Type Conversion :
    character can be type casted into int but not float into int

    import java.util.*;

public class JavaBasics {

    public static void main(String args[]){
        float marks = 99.999f;
        int marks2 = (int) marks;
        System.out.println(marks2);
    }
}
  */
 

/*📌Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

*/

import java.util.*;

/**
 * JavaBasics
 */
public class JavaBasics {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float sum = a+b+c;
        float total = sum + (sum*0.18f);
        System.out.println("The bill after 18%GST = " + total);
    }
}

