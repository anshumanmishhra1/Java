/*📌Airthematic Operatior


import java.util.*;
public class OperatorsInJava {
    public static void main(String args[]){
        int a = 10;
        int b = 5;
        System.out.println("sum = " + (a+b));
        System.out.println("diff = " + (a-b));
        System.out.println("Mul = " + (a*b));
        System.out.println("Quo= " + (a/b));
        System.out.println("Rem = " + (a%b));
    }
}


 */

 /*📌Unary Operator  
 import java.util.*;
public class OperatorsInJava {
    public static void main(String args[]){
        int a = 10;
        int b = a++; // preincrement
        int b =  ++a;  //postincrement

        // int c = --a;
        // int c = a--;
        System.out.println(a);
        System.out.println(b);
    }
}

*/


/*📌Relational Operators : ==, !=, >, <, <=, >= 


import java.util.*;
public class OperatorsInJava {
    public static void main(String args[]){
        int a = 10;
        int b = 10;

        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<=b);
        System.out.println(a<b);
        System.out.println(a>b);
    }
}

*/

/*📌Logical Operator : &&, ||, ! 

import java.util.*;
public class OperatorsInJava {
    public static void main(String args[]){
        int a = 10;
        int b = 10;

        System.out.println((a>b) && (a<b));
        System.out.println( (a>b) || (a<b));
    }
}
        
*/


/*📌Assignment Operator : =, +=, -=, *=, /= */

import java.util.*;
public class OperatorsInJava {
    public static void main(String args[]){
        int a = 10;
        int r1 = a+=10;
        int r2 = a-=10;
        int r3 = a*=10;
        int r4= a/=10;
        System.out.println(r3);
    }
}