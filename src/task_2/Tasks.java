package task_2;

import java.util.Scanner;

public class Tasks {
    private static Scanner scanner = new Scanner(System.in);

    // Четные и нечетные символы разделить по разным строкам


    // Количество цифр в строке
    public static void quantityOfNumbers(String enter) {
        if (enter != null) {
            int count = 0;
            for (int i = 0; i < enter.length(); i++) {
                if (Character.isDigit(enter.charAt(i))) {
                    count++;
                }
            }
            System.out.println("Количество цифр в строке: " + count);
        }
    }

    // Вводится строка из букв и цифр, построить новую только из цифр
    public static void buildNumber(String enter) {
        if (enter != null) {
            for (int i = 0; i < enter.length(); i++) {

            }
        }
    }

    // Удаление одинаковых символов
    public static void removeDuplicateCharacters(String enter) {
        if (enter != null) {
            StringBuilder sb = new StringBuilder();
            int idx;
            for (int i = 0; i < enter.length(); i++) {
                char c = enter.charAt(i);
                idx = enter.indexOf(c, i + 1);
                if (idx == -1) {
                    sb.append(c);
                }
            }
            String result = sb.toString();
            System.out.println(result);
        }
    }

    // Частота встречаемости символа в строке

    // Переворот строки
    public static void reverseString(String input) {
        if (input != null) {
            input = new StringBuilder(input).reverse().toString();
            System.out.println(input);
        }
    }

    // Количество вхождений подстроки в строку

    // Вывести слова строки в обратном порядке
    public static void reverseWord(String input) {
        if (input != null) {

        }
    }

    // Сортировка массива строк по алфавиту

    // Определить длину самого короткого слова в строке

    // Подсчет количества слов в строке
    public static void quantityOfWord(String enter) {
        int count = 0;
        if (enter.length() != 0) {
            count++;
            for (int i = 0; i < enter.length(); i++) {
                if (enter.charAt(i) == ' ') {
                    count++;
                }
            }
            System.out.println("Количества слов в строке: " + count);
        }
    }

    // Добавление пробелов в строку

    // Является ли строка палиндром?

    // Замена подстроки в строке

    // Расстояние между подстроками

    public static void main(String[] args) {
        System.out.println("Enter characters");
        String enter = scanner.nextLine();

        //removeDuplicateCharacters(enter);

        //quantityOfNumbers(enter);

        //quantityOfWord(enter);

        //reverseString(enter);

        reverseWord(enter);
    }
}

