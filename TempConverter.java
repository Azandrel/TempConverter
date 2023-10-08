import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {

        System.out.println("Wlecome to the temperature converter. Possible conersions are F -> C and C -> F");
        System.out.println("What will we convert? Enter 'F' to convert F -> C");
        System.out.println("What will we convert? Enter 'C' to convert C -> F");

        converter();

    }

    public static double converter() {
        Scanner scan = new Scanner(System.in);

        double temp = 0;
        String userDecision = scan.nextLine();

        while (!userDecision.equalsIgnoreCase("F") && !userDecision.equalsIgnoreCase("C")){
            System.out.println("Wrong input! Please enter 'F' or 'C'");
            userDecision = scan.nextLine();
        }

        if (userDecision.equalsIgnoreCase("F")){
            System.out.print("Please enter the temperature value in Fahrenheit: ");
            double tempInFahrenheit = scan.nextDouble();

            temp = (tempInFahrenheit - 32) * 5/9;
            System.out.println(tempInFahrenheit + "F is equal to: " + temp + " in celsius");

            scan.nextLine();
        } else if (userDecision.equalsIgnoreCase("C")){
            System.out.print("Please enter the temperature value in Celsius: ");
            double tempInCelsius = scan.nextDouble();

            temp = (tempInCelsius * 9/5) + 32;
            System.out.println(tempInCelsius + "C is equal to: " + temp + " in fahrenheit");

            scan.nextLine();
        } 


        scan.close();
        return temp;
    }
}
