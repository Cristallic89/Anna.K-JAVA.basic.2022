import java.util.Scanner;

class Ex3 {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, number3, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Mida soovid teha: '+',  '-',  '*', või / '/'");
        operator = input.next().charAt(0);

        System.out.println("Sisesta esimene number");
        number1 = input.nextDouble();


        System.out.println("Sisesta teine number");
        number2 = input.nextDouble();

        System.out.println("Sisesta kolmas number");
        number3 = input.nextDouble();

        switch (operator) {

            case '+':
                result = number1 + number2 + number3;
                System.out.println(number1 + " + " + number2 + " + " + number3+ " = " + result);
                break;


            case '-':
                result = number1 - number2 - number3;
                System.out.println(number1 + " - " + number2 + " - " + number3+ " = " + result);
                break;


            case '*':
                result = number1 * number2 * number3;
                System.out.println(number1 + " * " + number2 + " * " + number3+ " = " + result);
                break;


            case '/':
                result = number1 / number2 / number3;
                System.out.println(number1 + " / " + number2 + " +/ " + number3+ " = " + result);
                break;-

            default:
                System.out.println("Midagi läks valesti. :(");
                break;
        }

        input.close();
    }
}