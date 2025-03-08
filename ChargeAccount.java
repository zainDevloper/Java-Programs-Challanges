import java.util.Scanner;

class Charge_account {
    private final int[] validAccounts = {
        5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
        8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
        1005231, 6545231, 3852085, 7576651, 7881200, 4581002
    };

    public boolean isValidAccount(int accountNumber) {
        for (int validAccount : validAccounts) {
            if (validAccount == accountNumber) {
                return true;
            }
        }
        return false;
    }
}

public class ChargeAccount {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);
        Charge_account validator = new Charge_account();

        System.out.print("Enter a charge Account Number: ");
        int userAccount = scanner.nextInt();

        if (validator.isValidAccount(userAccount)) {
            System.out.println("Your Account Number is Valid.");
        } else {
            System.out.println("Your Account Number is INVALID.");
        }

        scanner.close();
    }
}
