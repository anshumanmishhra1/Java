public class overriding {
    public static void main(String[] args) {
        // Parent p1 = new Parent();
        // p1.show();

        // Parent p2 = new Child();
        // p2.show();

        // Parent a = new subClass1();
        // a.print();

        // a = new subClass2();
        // a.print();

        // BankAccount myAccount = new BankAccount("anshuman","123343453");
        // myAccount.showUsername();
        // myAccount.showPassword();

        Pen p = new Pen();
        p.color("red");
        p.tip();
    }
    
}


class Pen{
    private String color;
    private String tip;

    void color(String color){
       this.color = color;
       System.out.println(color);
    }

    void tip(){
        System.out.println("tip");
    }
}


// class BankAccount{
//     public String username;
//     private String password;

//     BankAccount(String username, String password){
//         this.username = username;
//         this.password = password;
//     }
//     void showUsername(){
//         System.out.println("username is this" + username);
//     }

//     private void showPassword(){
//         System.out.println("Password is this" + password);
//     }
// }


// class Parent{
//     void print(){
//         System.out.println("parent class is called");
//     }
// }

// class subClass1 extends Parent{
//     void print(){
//         System.out.println("SubClass1 class is called");
//     }
// }

// class subClass2 extends Parent{
//     void show(){
//         System.out.println("SubClass2 class is called");
//     }
// }



// class Parent{
//     void show(){
//         System.out.println("Parent is here");
//     }
// }

// class Child extends Parent{
//     void show(){
//         System.out.println("child is here");
//     }
// }