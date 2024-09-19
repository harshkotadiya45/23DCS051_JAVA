public class p19 {
    static class rectangle
    {
        double length,breadth;

        public rectangle(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }
        
        void area()
        {
            System.out.println("area  of rectangle : " + (length*breadth));
        }

        void perimeter()
        {
            System.out.println("perimeter of rectangle : " + 2*(length+breadth));
        }
    }

    static class squre extends rectangle
    {
        double side;
        public squre(double side)
        {
            super(side, side);
        }
    }

    public static void main(String[] args) {
        rectangle shapes[] = new rectangle[2];

        shapes[0] = new rectangle(10,20);
        shapes[1] = new squre(30);

        for (rectangle shape : shapes) {
            shape.area();
            shape.perimeter();
            System.out.println();
        }
    }
}
