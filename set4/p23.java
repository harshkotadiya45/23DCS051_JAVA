interface shapes
    {
        double area(double  x,double  y);
    }
    class rectangle implements shapes
    {
        public
        double area(double x,double y)
        {
            return x*y;
        }
    }
    class circle implements shapes
    {
        double pi = 3.14;
        
        public double area(double x,double y)
        {
            return pi*x*x;
        }
    }

public class p23 {
    public static void main(String[] args) { 
        rectangle r = new rectangle();
        circle c = new circle();
        shapes ob1=r;
        System.out.println("your area of rectangle : " + ob1.area(10, 20));
        ob1 = c;
        System.out.println("area of Circle : " + ob1.area(1, 0));

    }
}
