
import java.util.Scanner;
import java.lang.String;

public class Main
{
    public static void main(String [] args){
        String make, model, vinNumber, licensePN, mileage;
        int yearMan;
        char repeat;
        int action, licenseFormat;
        boolean checkFormat1;
        boolean checkFormat2;

        Scanner input = new Scanner(System.in);
        do{
            do{
                System.out.println("\nWelcome to the Vehicle Registration App");
                System.out.println("1. Do you want to register a vehicle:");
                System.out.println("2. Do want to view the registered vehivcles ");
                System.out.println("3. Do you want to exit the application.");
                action = input.nextInt();

            }while(action !=1 && action!= 2 && action != 3);

            System.out.println("Enter the brand/manufacturer of the vehicle: ");
            make = input.next();

            System.out.println("Enter the specific model of the vehicle: ");
            model = input.next();

            do{
                System.out.println("Enter the Vehicle Identification Number, a unique code for each vehicle: ");
                vinNumber= input.next().trim().toUpperCase();;
            }while(vinNumber.length() != 17);

            do{
                do{
                    System.out.println("Enter the license plate number of the vehicle: ");
                    System.out.println("you can either us the Old format (e.g., ABC123GP) or the New format (e.g., AB12CDGP)");
                    licensePN= input.next().trim().toUpperCase();}while(licensePN.length() != 8);

                checkFormat1 = licensePN.substring(0,3).matches("[a-zA-Z]+") && licensePN.substring(3,6).matches("\\d+") && licensePN.substring(6,8).toUpperCase().equalsIgnoreCase("GP");
                checkFormat2 = licensePN.substring(0,2).matches("[a-zA-Z]+") && licensePN.substring(2,4).matches("\\d+") &&licensePN.substring(4,6).matches("[a-zA-Z]+") && licensePN.substring(6,8).toUpperCase().equalsIgnoreCase("GP");

                if(checkFormat1 == false || checkFormat2 == false){
                    System.out.println("Pleaase use one of then provided format: ");
                }
            }while(licensePN.length() != 8 && (!checkFormat1 || !checkFormat2));

            System.out.println("Enter the year the vehicle was manufactured: ");
            yearMan = input.nextInt();

            System.out.println("The distance the vehicle has traveled, usually in kilometers or miles");
            mileage = input.next();

            System.out.println("Do you want to register another vehicle: ");
            repeat = input.next().charAt(0);

        }while(repeat == 'y' || repeat== 'Y');

    }
}
