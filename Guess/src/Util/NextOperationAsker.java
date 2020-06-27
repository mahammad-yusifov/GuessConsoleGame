package Util;


public class NextOperationAsker {

    public static void askForNextOperation() {
        System.out.println();
        System.out.println("--------------------------------------------------------");
        Menu.showAllMenu();
        int selectedMenuNumber = GatherUtil.askGetNumber("next operation");
        if (selectedMenuNumber < Menu.values().length && selectedMenuNumber > 0) {
            Menu selectedMenu = Menu.find(selectedMenuNumber);
            selectedMenu.process();
        } else {
            System.out.println("Please enter valid number");
            askForNextOperation();
        }
    }
}
