public class p21 {
    static class Degree
    {
        void getDegree()
        {
            System.out.println("I got a Degree.");
        }
    }

    static class Undergraduate extends Degree
    {
        void print()
        {
            System.out.println("I am Undergraduated.");
        }
    }

    static class Postgraduate extends Degree
    {
        void print()
        {
            System.out.println("I am Postgraduated.");
        } 
    }
    public static void main(String[] args) {
        Degree ob1 = new Degree();
        Undergraduate ob2 = new Undergraduate();
        Postgraduate ob3 = new Postgraduate();
        ob1.getDegree();
        ob2.print();
        ob3.print();
    }
}
