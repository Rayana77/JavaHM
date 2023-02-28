package homework2;

public class Task3 {

    public static void main (String[] args) {

        int Temperature1 = 120;
        int Temperature2 = 95;

        System.out.println("Температура первой колбы больше 100 градусов /температура второй колбы мешьше 100 градусов "
                + (Temperature1 > 100 && Temperature2 <100) );

        System.out.println("Температура первой колбы меньше 100 градусов /температура второй колбы больше 100 градусов "
         + (Temperature1 < 100 && Temperature2 > 100));
    }
}
