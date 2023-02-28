package homework2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args){

        System.out.println(("Введите число"));
        Scanner scanner  = new Scanner(System.in);
        int timeInSec = scanner.nextInt();
        System.out.println("Осталось  " + timeInSec + "секунд");
        double result, tm = (double)timeInSec, del = 3600;
        result = (double) (tm/del);
        double hours = timeInSec/3600;
        if (timeInSec < 3600) {

            System.out.println(  "До конца рабочего дня осталось менее часа.");
        }else {
            hours = (int) (timeInSec/3600);

            System.out.println("До конца рабочего дня осталось  "+hours+" часов");
        }


        {
        }










    }
}
