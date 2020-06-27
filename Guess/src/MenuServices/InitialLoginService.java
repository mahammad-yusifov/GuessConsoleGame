package MenuServices;

import Util.Menu;
import Util.NextOperationAsker;

import java.util.Scanner;

public class InitialLoginService {
    private static int banCount = 0;
    private static int downCounter = 3;

    public static void menuLogin() {
        System.out.println("Welcome to Guess game, " +
                "Please enter following information");
        System.out.println("Username: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        System.out.println("Password: ");
        Scanner sc1 = new Scanner(System.in);
        String passwordInput = sc1.nextLine();

        if (banCount < 3) {
            if (userInput.equals("user") && passwordInput.equals("11")) {
                System.out.println("Successfully logged");
                Menu.showAllMenu();
                NextOperationAsker.askForNextOperation();

            } else {
                banCount++;
                downCounter--;
                System.out.println("Username or password is invalid!");
                System.out.println("Remaining try chances: " + downCounter);
                System.out.println("Please try again...");
                if (banCount == 3) {
                    System.out.println("You banned!");
                    System.exit(0);
                }
                menuLogin();
            }
        }


    }


}
