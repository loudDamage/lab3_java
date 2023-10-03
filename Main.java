// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("List integers and separate them by spaces :");
        String input = scanner.nextLine();
        String[] myStrArray = input.split(" ");

        ArrayOfNumber(myStrArray);

        scanner.close();
        }

    public static void ArrayOfNumber(String[] myStrArray) {
        int total = 0;
        ArrayList<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < myStrArray.length; i++) {
            numberList.add(Integer.parseInt(myStrArray[i]));
            total += Integer.parseInt(myStrArray[i]);
        }

        System.out.println("The total is : " + total);

        System.out.println("The average is " + total/numberList.size());
    }
}


