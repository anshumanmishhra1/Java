import java.util.*;
public class interfaces {
    public static void main(String[] args) {
        // TestClass t = new TestClass();
        // t.display();

        Bicycle bicycle = new Bicycle();
        bicycle.chageGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrake(1);

        System.out.println("Bicycle Present state : ");
        bicycle.printStates();


        Bike bike = new Bike();
        bike.chageGear(1);
        bike.speedUp(4);
        bike.applyBrake(3);

        System.out.println("Bike present state is : ");
        bike.printStates();
    }
    
}

interface Vehicle{
    void chageGear(int a);
    void speedUp(int a);
    void applyBrake(int a);
}

class Bicycle implements Vehicle{
    int speed;
    int gear;

    public void chageGear(int newGear){
        gear = newGear;
    }

    public void speedUp(int increment){
        speed = speed + increment;
    }

    public void applyBrake(int decrement){
        speed = speed-decrement;
    }

    public void printStates(){
        System.out.println("spped " + speed + "gear " + gear );
    }
}

class Bike implements Vehicle{
    int speed;
    int gear;

    public void chageGear(int newGear){
        gear = newGear;
    }

    public void speedUp(int increment){
        speed = speed + increment;
    }

    public void applyBrake(int decrement){
        speed = speed-decrement;
    }

    public void printStates(){
        System.out.println("spped " + speed + "gear " + gear );
    }
}

// interface In1{
//     //public , static and final
//     int a = 10;

//     void display();


// }

// class TestClass implements In1{
//     public void display(){
//         System.out.println("Jai Siya Ram");
//     }
// }