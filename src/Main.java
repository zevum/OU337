
import java.util.Scanner;

public class Main {

    public static int Binary2Decimal(String binary) {


        int result = 0; // Temporarily holds result
        for (int i = 0; i < binary.length(); i++)

        {
            int digit;
            digit = Character.getNumericValue(binary.charAt(i));
            int position = binary.length() - i - 1;
            result += digit * Math.pow(2, position);

        }
        return result;

    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to the Binary to Decimal calculator Program\n");
        System.out.println("Enter binary number value: ");
        Scanner scanner = new Scanner(System.in);
        String buffer = scanner.nextLine();
        System.out.println("You entered: " + buffer + " for conversion.\n");
        System.out.println("Proceeding the data ....\n");
        System.out.println(Binary2Decimal(buffer));

    }


}
