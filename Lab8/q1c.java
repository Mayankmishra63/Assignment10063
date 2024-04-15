package day8;

/**
 *
 * @author acer
 */


class Outer2{
    static class Inner2{
        public static void display(){
            System.out.println("Inside display Inner");
        }
    }
}
public class q1c {
    public static void main(String[] args) {
        Outer2.Inner2.display();
    }
}
