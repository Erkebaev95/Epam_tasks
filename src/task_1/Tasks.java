package task_1;

import java.util.Scanner;

public class Tasks {
    private static Scanner scanner = new Scanner(System.in);

    // Четные и нечетные символы разделить по разным строкам

    // Количество цифр в строке
    public static void quantityOfWords(String enter) {
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

        }
    }

    // Частота встречаемости символа в строке

    // Переворот строки

    // Количество вхождений подстроки в строку

    // Вывести слова строки в обратном порядке

    // Сортировка массива строк по алфавиту

    // Определить длину самого короткого слова в строке

    // Подсчет количества слов в строке
    public static void quantityOfWord(String enter) {
        if (enter != null) {
            int count = 0;
            for (int i = 0; i < enter.length(); i++) {
                if (enter.equalsIgnoreCase(" ")) {
                    count++;
                }
            }
            System.out.println("words: " + count);
        }
    }

    // Добавление пробелов в строку

    // Является ли строка палиндром?

    // Замена подстроки в строке

    // Расстояние между подстроками

    public static void main(String[] args) {
        System.out.println("Enter characters");
        String enter = scanner.nextLine();

        //quantityOfNumbers(enter);

        //removeDuplicateCharacters(enter);

        quantityOfWord(enter);
    }
}

