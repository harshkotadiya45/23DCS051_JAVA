

public class p20 {
    static class shape{
        void printshape()
        {
            System.out.println("This is This is shape.");
        }
    }
    static class rectangle extends shape
    {
        void printrectangle()
        {
            System.out.println("This is rectangular shape.");
        }
    }

    static class circle extends shape
    {
        void printcircle()
        {
            System.out.println("This is circuler shape.");
        }
    }

    static class squre extends rectangle
    {
        void print()
        {
            System.out.println("squre is a ractangle.");
        }
    } 

    public static void main(String[] args) {
        squre ob1 = new squre();
        ob1.printrectangle();
        ob1.printshape();
    }
}
