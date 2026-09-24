package polymorphism;

public class Overload {
    public void display() {
        System.out.println("display method with no arguments");
    }
    public void display(int a) {
        System.out.println("display method with one argument: " + a);
    }
    public void display(int a, int b) {
        System.out.println("display method with two arguments: " + a + ", " + b);
    }
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.display();
        obj.display(10);
        obj.display(10, 20);
    }
}
