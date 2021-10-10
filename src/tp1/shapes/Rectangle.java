package tp1.shapes;

public class Rectangle implements shape {
    int h;
    int l;

    Rectangle(int hf, int lf){
        h=hf;
        l=lf;
    }

    //methods
    public void perimeter(){
        int p=(h+l)*2;
        System.out.println("Perimeter : "+p);
    }

    public void surface(){
        int s=l*h;
        System.out.println("Surface : "+s);
    }
}
