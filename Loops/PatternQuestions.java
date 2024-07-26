import java.util.*;

/*📌print star pattern 

public class PatternQuestions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}

*/

/*📌Printed inverted-star Pattern


public class PatternQuestions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
     
*/

/* 📌Print Half-Pyramid number pattern 


public class PatternQuestions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("\n");
        }
    }
}

 */

/* 📌Print Character pattern */

public class PatternQuestions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();               
        char c = (int) 'A';
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.print("\n");
        }
    }
}