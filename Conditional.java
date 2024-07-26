/*📌Conditional In Java 
 
    If(){
    code....
    }else if(){
    code....
    }else{
    }

    Or,

    switch(){
    }
    
    import java.util.*;
    public class Conditional {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            
            if(age>=18){
                System.out.println("vote,drive");
            }
            else{
                System.out.println("Can't vote and Drive ");
            }
        }   
    }
    
*/

/*📌Print if a number is Odd or Even :
 *
 
 import java.util.*;
 public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }   
}

*/


/*📌Income Tax Calculator  
 *
 
 import java.util.*;
 public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        System.out.println("Enter the income in Lakhs : \n");
        
        int tax;
        if(income< 500000){
            tax = 0;
        }
        else if(income>=500000 && income<1000000){
            tax =  (int) (income * 0.2);
        }
        else{
            tax =(int) (income * 0.5);
        }
        
        System.out.println("Tax is : " + tax);
    }   
}

*/

/*📍Ternary Operator  : 

    variable = condition ? statement : statement;



 import java.util.*;
public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        String vote = (age>18) ? "vote":"can't vote";
        System.out.println(vote);
    }   
}

 */

 /*📍Switch Statements : 
    switch(varibale){
        case 1 : 
            code...
        case 2 :
            code...
        case 3 :
            code...
        default : 
            code...
    }

    
    
    public class Conditional {
        
    public static void main(String[] args) {
        int number = 2;
        switch(number){
            case 1 : System.out.println("Samosa");
            break;
            case 2 : System.out.println("burger");
            break;
            case 3 : System.out.println("Mango shake");
            break;
            default : System.out.println("we wake up");
        }
    }
}


*/


/*📌Making A Calculator using Switch Case In Java  :  */

import java.util.Scanner;

/**
 * Conditional
 */
public class Conditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Both Numbers : \n");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter your operator  : \n");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.println(num1 + num2) ;
                break;
            case '-' : System.out.println(num1 - num2);
                break;
            case '*' : System.out.println(num1 * num2);
                break;
            case '/' : System.out.println(num1 / num2);
                break;
            default : System.out.println("Sahi se dal bhai");
        }
    }
}