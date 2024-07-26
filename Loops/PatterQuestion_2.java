import java.util.*;

/*📌Hollow rectangle Pattern :  
public class PatterQuestion_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || i==n || j==1 || j==m ){
                    System.out.print("x");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        
    } 
}

*/

/*📌Inverted  And Rotated Half Pyramid :
 

public class PatterQuestion_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++){{}
            System.out.print(" ");
        }
        for(int k = 1;k<=i;k++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
    
} 
}
*/

/*📌Inverted Half-Pyramind with Numbers : 
 

public class PatterQuestion_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){{}
            System.out.print(j);
         }
         System.out.print("\n");
        }
        
    } 
}

*/

/*📌Floyd's Triangle : 


public class PatterQuestion_2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int counter = 1;
     for(int i =1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(counter);
            counter++;
        }
        System.out.print("\n");
    }
    
} 
}
*/

/*I📌0-1 Triangle : 

*/

public class PatterQuestion_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2==0){
                    System.out.print("1");
                }else System.out.print("0");
            }
            System.out.print("\n");
        }
    }
}