/*📍While Loops */

/*📌print hello world 10 times 

import java.util.*;
public class Introduction {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        while(counter<4){
            System.out.println("Hello");
            counter++;
        }
        System.out.println("Enter the value of n : \n" + n);
    }
}

*/

/*📌Print from 1 to 10


import java.util.*;
public class Introduction {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        while(counter<=n){
            System.out.print(counter + " ");
            counter++;
        }
        
    }
}

*/

/*📌Sum of first N natural Number 

import java.util.*;
public class Introduction {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum= 0;
        int counter = 0;
        while(counter<=n){
            sum+=counter;
            counter++;
        }
        System.out.println(sum);
    }
}

*/

/*📍Foor Loops 
    for(initalisation; condition; updation){
       code......
    }
    
    import java.util.*;
    public class Introduction {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i + " ");
        }
    }
}


*/

/*📌Print Square Pattern


import java.util.*;
public class Introduction {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
    }
}

*/

/*📌Print Reverse of a Number 
 


import java.util.*;
public class Introduction {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while(n>0){
            int remainder = n%10;
            ans = ans*10 + remainder; 
            n/=10;
        }
        
        System.out.println(ans);
        
    }
}

*/


/*📍Do-while Loop 



import java.util.*;
public class Introduction {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        do{
            System.out.println("hello");
            counter++;
        }while(counter<=5);
    }
}

*/

import java.util.*;
public class Introduction {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int n = sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     if(i==5) break;
        //     System.out.print(i + " ");
        // }
        // int n;
        // do{
        //     n = sc.nextInt();
        //     if(n%10==0) break;
        //     System.out.println(n);
        // } while(true);

        for(int i=10;i<=n*10;i++){
            if(i%10==0) continue;
            System.out.print(i + " ");
        }
    }
}

