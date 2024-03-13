import java.util.Scanner;
import java.time.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String day=LocalDate.now().getDayOfWeek().name().toLowerCase();

        System.out.println("Insert your habitation: ");
        String habitation= scanner.next();

        System.out.println("Insert your age: ");
        int age = scanner.nextInt();

        System.out.println("Insert a day of the week: ");



        double ticketPrice = 40;
        double discount = 0;
        double ageDiscount = 0;
        double habitationDiscount = 0;
        double dayOfTheWeekDiscount = 0;

        if(age<=10) {
            ageDiscount=100;
            ticketPrice=0;
        } else if( age <= 18){
            ageDiscount=50;
        }
        if(habitation.equals("Warsaw")){
            habitationDiscount=10;
        }
        if(day.equals("thursday")){
            dayOfTheWeekDiscount=100;
            ticketPrice=0;
        }

        discount=ageDiscount+habitationDiscount+dayOfTheWeekDiscount;
        ticketPrice= ticketPrice-(ticketPrice*discount*0.01);


        System.out.println("Data: " + habitation + "," + age + "years old" + "," + "weekday Ticket price: " + ticketPrice + "PLN" );
        System.out.println("Discount: " + discount + "%");


    }
}