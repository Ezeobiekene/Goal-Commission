
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double commGoal;

        System.out.print("Enter your desired commission goal: ");
         commGoal = input.nextDouble();


         if (commGoal >= 900){
             double remTwo = commGoal - 900;
             double saleAmount = (400 / 0.08) + (500 / 0.10) + (remTwo / 0.12);
             System.out.println("To get a Commission of $" + commGoal + " you have to make $" + saleAmount + " worth of sales.");
         }

        else if (commGoal >= 400 ) {
            double remOne = commGoal - 400;
            double saleAmount = (400 / 0.08) + (remOne / 0.10);
            System.out.println("To get a Commission of $" + commGoal + " you have to make $" + saleAmount + " worth of sales.");
        }

        else{
            double saleAmount = (400 / 0.08);
            System.out.println("To get a Commission of $" + commGoal + " you have to make $" + saleAmount + " worth of sales.");
        }
    }
}
