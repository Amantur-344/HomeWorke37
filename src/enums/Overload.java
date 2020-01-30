package enums;

import java.util.ArrayList;
import java.util.LinkedList;

public enum Overload { ;
    public void isqrt(int number){
        int [] arr = new int[10];
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        if(number != 0){
            for (int i = 0; i < 10; i++) {
                arr[i] = number;
                list.add(i,number);
                linkedList.addLast(number);
            }
        }else{
            for (int i = 0; i < 10; i++) {
                arr[i] = number;
                list.add(i,number);
                linkedList.addFirst(number);
            }
        }
    }
}
