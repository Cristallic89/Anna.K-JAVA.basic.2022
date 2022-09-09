package week3;

import java.util.Scanner;

public class Ex56 {
    public static String reverse(String text) {
        String textReverse = "";
        int count = text.length();
        int index = count - 1;
        while(index >= 0){
            textReverse += text.charAt(index);
            index--;
        }
        return textReverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}