package Java;

public class Practice1 extends Demo1{

    Practice1() {
        super(44);
    }

    
        
    public static void main(String[] args) {
       Practice1 p1 = new Practice1();
    }
}

class Demo1 {
    // Demo1() {
    //     System.out.println("One");
    // }

    Demo1(int a) {
        System.out.println(a);
    }
}