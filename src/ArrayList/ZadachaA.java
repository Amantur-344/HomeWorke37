package ArrayList;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class ZadachaA {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before: " + now);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        for (int i = 0; i < 100; i++) {
            list.add(500000,i);//Добавил в середину
        }
        LocalDateTime after = LocalDateTime.now();
        double diff = now.until(after, ChronoUnit.MILLIS);
        System.out.println(diff);



        LocalDateTime before = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            list.add(0,i);//Добавил в начало
            list.add(1000000,i);//Добавил в конец
        }
        LocalDateTime after1 = LocalDateTime.now();
        double diff2 = before.until(after1, ChronoUnit.MILLIS);
        System.out.println(diff2);



        LocalDateTime before2 = LocalDateTime.now();
        list.get(500000);
        list.get(1000000);

        LocalDateTime after2 = LocalDateTime.now();
        double diff3 = before2.until(after2, ChronoUnit.MILLIS);
        System.out.println(diff3);


        LocalDateTime before3 = LocalDateTime.now();
        list.remove(500000);
        list.remove(1000000);


        LocalDateTime after3 = LocalDateTime.now();
        double diff4 = before3.until(after3, ChronoUnit.MILLIS);
        System.out.println(diff4);
    }
}
