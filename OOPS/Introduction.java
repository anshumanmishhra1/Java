import java.util.*;

public class Introduction {
  
    public static void main(String[] args) {
        // Student kunal = new Student();
        // Student anshu  = new Student();
        // kunal.marks = 99;
        // kunal.name = "kunal";
        // kunal.rollno = 13;
        // System.out.println(kunal.rollno);
        // System.out.println(kunal.name);
        // System.out.println(kunal.marks);
        // kunal.greeting();
        // System.out.println(kunal.name);;
        // System.out.println(anshu.name);;

        Test a = new Test(name : "rahul");
        Test b = new Test(name: "kuanl");

        System.out.println();
    }
}


class Test {
    String name;
    Test(String name){
        this.name = name;
    }
}
class Student{
    int rollno;
    String name;
    float marks;

    // void greeting() {
    //     System.out.println("Hello my namne is " + this.name);
    // }
    // Student(){
    //     this.name = "Kunal Kushwaha";
    //     this.rollno = 13;
    //     this.marks = 45.5f;
    // }
}