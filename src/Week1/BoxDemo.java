package Week1;

class Box{
    float width;
    float height;
    float depth;
} //define the call Box
public class BoxDemo {
    public static void main(String[] args) {
        Box bx = new Box();
        bx.width = 70;
        bx.depth = 50;
        bx.height = 54;
        float volume = bx.width * bx.height * bx.depth;
        System.out.println("Volume of the box " + volume);
    }
}
