package Week1;

class Box7{
    double width;
    double height;
    double depth;
    public Box7(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    double volume(){
        return width * height * depth;
    }
}
public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 box7 = new Box7(2.1,3.5,4.2);
        double vol = box7.volume();
        System.out.printf("The volume is %10.2f " , vol);

    }
}
