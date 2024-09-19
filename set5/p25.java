public class p25 {
        public static void main(String[] args) {
            try
            {
                int a = 20;
                int b = 0;
                int result = a/b;
                System.out.println("a/b : " + result);
            }
            catch(ArithmeticException e)
            {
                System.out.println("caught an Exeption : " + e.getMessage());
            }
        }
}
