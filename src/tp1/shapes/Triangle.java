package tp1.shapes;

public class Triangle implements shape {
    int a;
    int h;
    int b;

    Triangle(int af, int hf, int bf){
    a=af;
    h=hf;
    b=bf;
    }

    //methods
    public void perimeter(){
        int p=a+b+h;
        System.out.println("Perimeter : "+p);
    }

    public void surface(){
        int s=(b*h)/2;
        System.out.println("Perimeter : "+s);
    }
}
