package Util;

import MenuServices.*;

public enum Menu {
    REGISTER(1, "Register the attendees", new MenuRegisterService()),
    START(2, "Start the game", new MenuStartService()),
    LOGOUT(3, "Logout", new MenuLogoutService()),
    EXIT(4, "Exit", new MenuExitService()),
    UNKNOWN(-1, null, null);

    private final int number;
    private final String label;
    private final MenuService menuService;

    Menu(int number, String label, MenuService menuService) {
        this.number = number;
        this.label = label;
        this.menuService = menuService;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKNOWN) {
                System.out.println(menus[i]);
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public String getLabel() {
        return label;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public void process() {
        menuService.process();

    }

}

