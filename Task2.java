package homework2;

import java.util.Scanner;

public class Task2 {

    public static void main (String[] args) {

        System.out.println("Выберите условие: 1.isReweOpen  2. isEdekaOpen");
        Scanner enterCondition = new Scanner(System.in);
        int i =enterCondition.nextInt();

        if ( i == 1 | i == 2) {
            System.out.println("Я могу купить еду");
        }
        else if (i == 3) {
            System.out.println("Я не могу купить еду");

        }
    }


}
