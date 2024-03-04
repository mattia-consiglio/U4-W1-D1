import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //part two of the exercise
        System.out.println("Enter first string for concatenation: ");
        String aString = sc.next();
        System.out.println("Enter second string for concatenation: ");
        String bString = sc.next();
        System.out.println("Enter third string for concatenation: ");
        String cString = sc.next();
        System.out.println(cString + " " + bString+ " "+ aString );

        sc.close();
    }
}
