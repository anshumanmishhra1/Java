class polymorphism {
    public static void main(String[] args) {
        Helper a = new Helper();
        System.out.println(a.multiply(1, 15));
        System.out.println(a.multiply(2, 3, 4));
    }

}

class Helper{
    int multiply(int a, int b){
        return a*b;
    }

    int multiply(int a, int b, int c){
        return a*b*c;
    }
}