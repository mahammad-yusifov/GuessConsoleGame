package Util;

import java.util.Scanner;

public class GatherUtil {
    public static String askGetText(String ask) {
        System.out.println("Enter " + ask + ":");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static int askGetNumber(String ask){
        System.out.println("Enter " + ask + ":");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
