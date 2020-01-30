package ArrayList;

import java.io.FileWriter;
import java.io.IOException;

public class Vopros {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("ArrayFile.txt");
        fileWriter.write("1.В массиве мне не нравится то что лг мало функциенальный");
        fileWriter.write("2.У ArreyList есть минусы такие как трудное добавление в конец и в начало " +
                "но в вообщем я плохо его знаю");
        fileWriter.write("3.Структура его не совсем похожа на массив, если массив связываются " +
                "с помощью индексов а линкед связываются указвая друг на друга ");
        fileWriter.write("5.Я линкед мало использовал из-за этого плохо знаю его плюсы" +
                "и минусы ");
    }
}
