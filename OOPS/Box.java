import java.util.*;
public class Box {  
    public static void main(String[] args){
        // Programmer anshuman = new Programmer();
        // System.out.println("The Bonus of Anshuman " + anshuman.bonus);
        // System.out.println("The salary of Anshuman " + anshuman.salary);

        // Dog d = new Dog();
        // d.bark();
        // d.eat();
        
        BabyDog d1 = new BabyDog();
        d1.bark();
        d1.eat();
        d1.weep();

    }
}

class Employee {
    int salary = 50000;
}

class Programmer extends Employee {
    int bonus = 10000;
}

class Animal {
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking....");
    }
}

class BabyDog extends Dog{
    void weep(){
        System.out.println("Weeping...");
    }
}

class Cat extends Animal{
    
}