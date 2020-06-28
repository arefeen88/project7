package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>();


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your capacity");

        int capacity = scanner.nextInt();

        System.out.print("Enter those number");

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < capacity; i = i + 1) {

            list.add(scanner.nextInt());
        }
        for (int j = 0; j < list.size(); j = j + 1) {
            System.out.println(list.get(j));

        }


    }
}
