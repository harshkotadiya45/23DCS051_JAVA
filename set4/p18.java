import java.util.Scanner;
public class p18 {
    public static class Member
    {
        String name,Address;
        int age;
        double salary;
        long contact;
        Scanner sc = new Scanner(System.in);

        
        void printSalary()
        {
            System.out.println("salary of member :" + salary);
        }

    }
    public static class Employee extends Member
    {
        String specialization;
        String department;

        void getdata()
        {   
            System.out.println("EMPLOYEE");
            System.out.print("enter your name :" );
            name = sc.nextLine();
            System.out.print("enter your age : ");
            age = sc.nextInt();
            System.out.print("enter your mobile number :");
            contact = sc.nextLong();
            System.out.print("enter your address :");
            Address = sc.next();
            System.out.print("enter your salary : ");
            salary = sc.nextDouble();
            System.out.print("enter specialization : ");
            specialization = sc.next();
            System.out.print("enter department : ");
            department = sc.next();
        }

        void print()
        {
            System.out.println("EMPPLOYEE");
            System.out.println("enter your name :" + name);
            System.out.println("enter your age : " + age);
            System.out.println("enter your mobile number :" + contact);
            System.out.println("enter your address :" + Address);
            // System.out.println("enter your salary : " + salary);
            printSalary();
            System.out.println("enter specialization : " + specialization);
            System.out.println("enter department : " + department);
        }

    }

    public static class Manager extends Member
    {
        String specialization;
        String department;

        void getdata()
        {
            System.out.println("MANGER");
            System.out.print("enter your name :" );
            name = sc.nextLine();
            System.out.print("enter your age : ");
            age = sc.nextInt();
            System.out.print("enter your mobile number :");
            contact = sc.nextLong();
            System.out.print("enter your address :");
            Address = sc.next();
            System.out.print("enter your salary : ");
            salary = sc.nextDouble();
            System.out.print("enter specialization : ");
            specialization = sc.next();
            System.out.print("enter department : ");
            department = sc.next();
        }

        void print()
        {
            System.out.println("MANGER");
            System.out.println("enter your name :" + name);
            System.out.println("enter your age : " + age);
            System.out.println("enter your mobile number :" + contact);
            System.out.println("enter your address :" + Address);
            // System.out.println("enter your salary : " + salary);
            printSalary();
            System.out.println("enter specialization : " + specialization);
            System.out.println("enter department : " + department);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.getdata();
        e1.print();
        Manager m1 = new Manager();
        m1.getdata();
        m1.print();        
    }
}
