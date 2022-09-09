package week2;

public class Ex39 {
    private static void printStars(int amount) {
        int times = 1;
        while(times <= amount){
            System.out.print("*");
            times++;
        }
        System.out.println();
    }

    private static void printSquare(int sideSize){
        int row = 1;
        while(row <= sideSize){
            int field = 1;
            while(field <= sideSize){
                System.out.print("* ");
                field++;
            }
            System.out.println();
            row++;
        }
    }

    private static void printTriangle(int size){
        int row = 1;
        while(row <= size){
            int field = 1;
            while(field <= row){
                System.out.print("* ");
                field++;
            }
            System.out.println();
            row++;
        }
    }

    private static void printRectangle(int width, int height){
        int row = 1;
        while(row <= height){
            int field = 1;
            while(field <= width){
                System.out.print("* ");
                field++;
            }
            System.out.println();
            row++;
        }
    }

    public static void main(String[] args) {
        printTriangle(4);
    }
}