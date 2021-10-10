package tp1.shapes;

public class Main {
    public static void main(String[] args) {
        // if I want to create a new shape (for example square)
        // how can I force the implementation of perimeter and surface on that shape ?
        Triangle t1 = new Triangle(5,2,4);
        Rectangle r1 = new Rectangle(2,10);
        System.out.println("Triangle: ");
        t1.perimeter();
        t1.surface();
        System.out.println("Rectnagle: ");
        r1.perimeter();
        r1.surface();

    }
}
