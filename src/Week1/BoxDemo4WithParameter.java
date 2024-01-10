package Week1;

class Box5{
    double width;
    double height;
    double depth;
    double volume(){
        return width*height*depth;
    }
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
public class BoxDemo4WithParameter {
    public static void main(String[] args) {
        Box4 myBox1 = new Box4();
        Box4 myBox2 = new Box4();

        myBox1.width = 54;
        myBox1.height = 33;
        myBox1.depth = 89;

        myBox2.width = 36;
        myBox2.height = 89;
        myBox2.depth = 23;
        double vol;
        vol = myBox1.volume();
        System.out.println("The volume of box1 is " + vol);
        vol = myBox2.volume();
        System.out.println("The volume of box2 is " + vol);

        Box5 myBox3 = new Box5();
        myBox3.setDim(3,4,5);
        vol = myBox3.volume();
        System.out.println("The volume of box3 is " + vol);
    }
}
