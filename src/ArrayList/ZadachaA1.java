package ArrayList;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;

public class ZadachaA1 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before: " + now);
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        for (int i = 0; i < 100; i++) {
            list.add(500000,i);//Добавил в середину
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = now.format(formatter);
        System.out.println("After: " + formatDateTime);



        for (int i = 0; i < 100; i++) {
            list.addFirst(i);//Добавил в начало
            list.addLast(i);//Добавил в конец
        }
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime1 = now.format(formatter1);
        System.out.println("After: " + formatDateTime1);

        list.get(500000);
        list.get(1000000);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime2 = now.format(formatter2);
        System.out.println("After: " + formatDateTime2);

        list.remove(500000);
        list.remove(1000000);

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime3 = now.format(formatter3);
        System.out.println("After: " + formatDateTime3);

        //Я нонял как их нужно замерять

    }
}
