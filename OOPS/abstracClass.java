import java.util.*;;

public class abstracClass {
    public static void main(String[] args) {
        // Subject x = new IT();
        // x.syllabus();
        // x.learn();

        // Base b = new Derived();
        // b.fun();

        Derived d = new Derived();
        d.fun();
    }

}

abstract class Base {
    Base(){
        System.out.println("Base constructor is called");
    }
}

class Derived extends Base {
    Derived(){
        System.out.println("Derived constructor is called");
    }

    void fun(){
        System.out.println("Derived Fun() is called");
    }
}

// abstract class Base{
// void fun(){};
// }

// class Derived extends Base{
// void fun(){
// System.out.println("Derived fun() called");
// }
// }

// abstract class Subject{
// Subject(){
// System.out.println("Learning Subject");
// }

// abstract void syllabus();

// void learn(){
// System.out.println("preparing right now ");
// }
// }

// class IT extends Subject{
// void syllabus(){
// System.out.println("C, Java, C++");
// }
// }