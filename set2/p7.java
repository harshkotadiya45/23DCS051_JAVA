import java.util.Scanner;

public class p7 {

    static void front_times(String a, int n) {

        for (int i = 0; i < n; i++)
        {
            if (a.length() < 3)
            {
                System.out.print(a);
            }
            else
            {
                for (int j = 0; j < 3; j++)
                {
                    System.out.print(a.charAt(j));
                }
            }
        }
    }

    public static void main(String[] args) {
        String a;
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("enter String :");
        a = s.nextLine();
        System.out.print("enter time to print :");
        n = s.nextInt();
        front_times(a, n);
        s.close();

    }
}

// import java.util.Scanner;

// public class p7 {
//        public static void main(String[] args) 
//        {
//         String str;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your string : ");
//         str = sc.nextLine();
//         int n;
//         System.out.println("how many times do you print : ");
//         n = sc.nextInt();
//         if(str.length() <3)
//         {   
//             for(int i=0;i<n;i++)
//             {
//                 System.out.print(str);
//             }
//         }
//         else
//         {
//             for(int i=0;i<n;i++)
//             {
//                 System.out.print(str.substring(0,3));
//             }
//         }
//        sc.close();
//        }
// }
