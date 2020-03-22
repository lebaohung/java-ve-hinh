import java.sql.SQLOutput;
import java.util.Scanner;
public class show {
    public static void main(String[] args) {
        System.out.println("Show");
        System.out.println("1. Show the rectangle");
        System.out.println("2. Show the square triangle");
        System.out.println("3. Show isosceles triangle");
        System.out.println("4.Exit");
//        int choice = -1;
//        while (choice != 0) {
        Scanner inputChoice = new Scanner(System.in);
        System.out.print("Enter choice: ");
        int choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    showRectangle(args);
                    break;
                case 2:
                    showSquareTriangle(args);
                    break;
                case 3:
                    showIsoscelesTriangle(args);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice!");
                    break;
//            }
        }
    }

    public static void showRectangle(String[] args) {
        System.out.println("Show Rectangle");
        Scanner scannerRectangle = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = scannerRectangle.nextInt();
        System.out.print("Enter width: ");
        int width = scannerRectangle.nextInt();
        for(int i = 0; i <  height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void showSquareTriangle(String[] args) {
        System.out.println("Show Square Triangle");
        Scanner scannerST = new Scanner(System.in);
        System.out.print("Enter width: ");
        int width = scannerST.nextInt();
        System.out.print("Enter height:");
        int height = scannerST.nextInt();
        for (int i = 0; i < height; i ++) {
            while (width != 0) {
                for (int j = 0; j < width ; j++) {
                    System.out.print("*");
                }
                System.out.println();
                width--;
            }
        }
    }

    public static void showIsoscelesTriangle(String[] args) {
        System.out.println("Show Isosceles Triangle");
        Scanner scannerIT = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = scannerIT.nextInt();
        System.out.print("Enter width : ");
        int width = scannerIT.nextInt();
        int widthCenter = (int)width/2 + 1 ;
        int half1 = 1, half2 = width - 1;
        for (int i = 0; i < height; i ++) {
            while (half1 <= width) {
                for (int j = 0; j < half1; j++) {
                    System.out.print("*");
                }
                System.out.println();
                half1++;
            };
            while (half1 > width && half2 >= 1 ) {
                for (int k = 0; k < half2; k++ ) {
                    System.out.print("*");
                }
                System.out.println();
                half2--;
            }
        }
    }
}
