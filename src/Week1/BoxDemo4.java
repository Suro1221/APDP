package Week1;

class Box4{
    double width;
    double height;
    double depth;
    double volume(){
        return width*height*depth;
    }
}
public class BoxDemo4 {
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
        //double volume1 = myBox1.volume();
        //double volume2 = myBox2.volume();



    }
}
