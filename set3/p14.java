public class p14 {
    public  static class date
    {
        int month,day,year;
        date(int m,int d,int y)
        {
            month = m;
            day = d;
            year = y;
        }
        void displayDate()
        {
            System.out.println(month + "/" + day + "/" +year);
        }
    }
    public static void main(String[] args) {
        date o1 = new date(10,26, 2005);
        o1.displayDate();
    }
}
