import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Insert the number to choose what to do:");
        System.out.println("0: calculate the rectangle perimeter");
        System.out.println("1: check if a number is even or odd");
        System.out.println("2: calculate the triangle perimeter and area");


        Scanner sc = new Scanner(System.in);
        int selection= Integer.parseInt(sc.next());
        if (selection == 0)
        {
        //part one of the exercise
            System.out.println("Enter the height of the rectangle: ");
            double height = Double.parseDouble(sc.next());
            System.out.println("Enter the width of the rectangle: ");
            double width = Double.parseDouble(sc.next());
            System.out.println("The perimeter of the rectangle is: " + rectanglePerimeter(width, height));
        }

        if (selection==1){
            System.out.println("Insert an integer number:");
            int evenOdd = evenOdd(Integer.parseInt(sc.next()));
            if (evenOdd==0){
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }
        }

        if (selection==2) {
            System.out.println("Insert the length of the first triangle side in cm");
            double a = Float.parseFloat(sc.next());
            System.out.println("Insert the length of the second triangle side in cm");
            double b = Float.parseFloat(sc.next());
            System.out.println("Insert the length of the third triangle side in cm");
            double c = Float.parseFloat(sc.next());

            double[] result = triangleAreaAndPerimeter(a,b,c);
            System.out.println("The triangle perimeter is "+ result[0] +" cm");
            System.out.println("The triangle area is "+ result[1] +" cm3");
        }

        sc.close();
    }

    public static double rectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    public static int evenOdd(int num) {
        if (num % 2 == 0) {
            return 0;
        }
        return 1;
    }

    public static double[] triangleAreaAndPerimeter(double a, double b, double c) {
        double perimeter = a+b+c;
        double p = perimeter / 2;
        double area = Math.sqrt((p*(p-a)*(p-b)*(p-c)));
        return new double[]{perimeter, area};
    }
}
