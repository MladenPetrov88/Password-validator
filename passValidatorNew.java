import java.util.Scanner;

public class passValidatorNew {
    private static void checkPassword(String input) {
        int positiveCount = 0;
        if (input.length() < 6 || input.length() > 11) {
            System.out.println("Password must be between 6 and 10 characters");
        } else {
            positiveCount++;
        }


        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            int currentNumber = input.charAt(i);
            if (currentNumber < 48 || currentNumber > 57 && currentNumber < 65 || currentNumber > 90 && currentNumber < 97 || currentNumber > 122) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Password must consist only of letters and digits");
        } else {
            positiveCount++;
        }


        int countNumber = 0;
        for (int i = 0; i < input.length(); i++) {
            int currentNumber = input.charAt(i);
            if (currentNumber >= 48 && currentNumber <= 57) {
                countNumber++;
            }
        }
        if (countNumber < 2) {
            System.out.println("Password must have at least 2 digits");
        } else {
            positiveCount++;
        }

        if (positiveCount >= 3) {
            System.out.println("Password is valid");
        }

    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        checkPassword(input);
    }
}
