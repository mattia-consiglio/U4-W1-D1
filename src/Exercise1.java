import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        //part one of the exercise
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number for multiplication: ");
        int aInt = Integer.parseInt(sc.next());

        System.out.println("Enter second number for multiplication: ");
        int bInt = Integer.parseInt(sc.next());
        System.out.println(multiply(aInt, bInt));

        //part two of the exercise
        System.out.println("Enter first string for concatenation: ");
        String aString = sc.next();
        System.out.println("Enter second string for concatenation: ");
        String bString = sc.next();
        System.out.println(concat(aString, bString));

        sc.close();
        //part three of the exercise
        String[] array = {"a", "b", "c", "d", "e"};
        String[] array2 = addInArray(array, "f");
        System.out.println(Arrays.toString(array2));
    }
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String concat(String a, String b) {
        return a + " " + b;
    }

    /**
     *
     * @param array the array to add to, must be length 5
     * @param value value to add to array
     * @return the array with the value added
     */
    public static String[] addInArray(String[] array, String value) {
        if(array.length != 5) {
            throw new IllegalArgumentException("Array length must be 5");
        }
        array = Arrays.copyOf(array, array.length + 1);
//        System.out.println(Arrays.toString(array));

        //move the 4th and 5th elements to the right
        for (int i = array.length -1; i > 3; i--) {
            System.out.println(i);
            array[i] = array[i - 1];

        }

        array[3] = value;
        return array;
    }
}
