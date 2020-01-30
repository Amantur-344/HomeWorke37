package set;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        HashSet<Dog> dalmotinez = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            dalmotinez.add(new Dog( "Spake",i));
        }
        //Он почему то выводил адресса не смог имправить и дальше идти нне ьыло смысла

        FileWriter fileWriter = new FileWriter("Set.txt");
        fileWriter.write("1.Тоже самое что и лист только тут все угиеальны а если " +
                "обнаружется одинаковые то он их удалит");
        fileWriter.write("2.По моему мнению чтобы сохранить уникальность например в гугле" +
                "нет оддинаковых адрессов или в мире не встпечается одинаковых номеров");
        fileWriter.write("3.Работая как обычный арррай только еще удаляя похожие елементы");
        fileWriter.write("5.Перевести его на хаш сет");
    }
}
