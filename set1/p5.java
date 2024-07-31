import java.util.Scanner;
public class p5 {
    public static void main(String[] args)
    
    {
        Scanner input = new Scanner(System.in);
        System.out.println("This is the elctric appliance shop bill.\nPlease enter the number of items you want to buy :\n");
        int num = input.nextInt();
        int[] items = new int[num];
        double sum = 0;
        
        for(int i=0;i<num;i++){
        double price;
        System.out.println("1. Motor\n2. fan\n3. tube\n4. wires\n5. Other items.");
        items[i] = input.nextInt();
        switch (items[i]) {
            case 1:
            System.out.println("Enter the price of Motor : ");
            price = input.nextInt();
            price += price*0.08;
            break;

            case 2:
            System.out.println("Enter the price of Fan : ");
            price = input.nextInt();
            price += price*0.12;
            break;

            case 3:
            System.out.println("Enter the price of Tube : ");
            price = input.nextInt();
            price += price*0.05;
            break;

            case 4:
            System.out.println("Enter the price of Wires : ");
            price = input.nextInt();
            price += price*0.075;
            break;

            case 5:
            System.out.println("Enter the price of Other items : ");
            price = input.nextInt();
            price += price*0.03;
            break;
            default : 
            System.out.println("Please enter valid number");
            price = 0;
            break;    
        }
        sum += price;
        }
        System.out.println("Your total amount to pay is ..."+ sum);
        input.close();
    }
}