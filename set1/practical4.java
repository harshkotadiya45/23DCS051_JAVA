
import java.util.Scanner;



public class practical4 {
    public static void main(String[] args) {
        int size,sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter size of an array : ");
        size = sc.nextInt();
        int [] arr= new int [size];
        int i;
        for(i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("sum of yore array : " + sum);
    }
}
