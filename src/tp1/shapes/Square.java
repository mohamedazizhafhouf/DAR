package tp1.shapes;

public class Square implements shape {
    int a;
    
    Square(int af){
        a=af;
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter : "+this.a*4);
    }

    @Override
    public void surface() {
        System.out.println("Perimeter : "+this.a*a);

    }
}
