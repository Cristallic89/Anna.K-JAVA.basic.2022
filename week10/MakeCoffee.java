package week10;

import java.util.Scanner;

public class MakeCoffee{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nTeeme kohvi või ei J or E ?");
        char d;
        d = scan.next().charAt(0);
        if(d == 'J' || d == 'j'){
            CoffeeMachine cm = new CoffeeMachine();     //Instances For CoffeMachine
            cm.start();     //In order to call All Private Method Calling Public mathod
            System.out.println("Lülitan välja...\n");
        }else
            System.out.println("Lülitan välja...\n");
    }
}
