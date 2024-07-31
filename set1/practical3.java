
import java.util.Scanner;
public class practical3 {
    public static void main(String[] args) {
        double meter,hour,minete,second;
        double total_second,total_hour;

        Scanner sc = new Scanner(System.in);
        System.out.print("enter your distance in meter : ");
        meter = sc.nextDouble();
        System.out.print("enter your time in hour : ");
        hour = sc.nextDouble();
        System.out.print("enter your time in minete : ");
        minete = sc.nextDouble();
        System.out.print("enter your time in second : ");
        second = sc.nextDouble();
        total_second = ((hour*3600) + (minete*60) + second);
        System.out.println("speed in m/s : " + (meter/total_second) + " m/s");
        total_hour= (hour + minete/60 + second/3600);
        System.out.println("speed in km/hr : " + ((meter/1000)/total_hour) + "km/hr");
        System.out.println("speed in miles per hour : " + ((meter/1609)/total_hour) + "miles/hour");
    }
}
