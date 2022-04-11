package task_2;

import java.util.Scanner;

public class Tasks {
    private static Scanner scanner = new Scanner(System.in);

    // Четные и нечетные символы разделить по разным строкам
    public static void symbols(String input) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        if (input != null) {
            for (int c = 0; c < input.length(); c++) {
                if (c % 2 == 0) {
                    odd.append(input.charAt(c));
                } else {
                    even.append(input.charAt(c));
                }
            }
            System.out.println(odd);
            System.out.println(even);
        }
    }


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

    // Переворот строки
    public static void reverseString(String input) {
        if (input != null) {
            input = new StringBuilder(input).reverse().toString();
            System.out.println(input);
        }
    }

    // Вывести слова строки в обратном порядке
    public static void reverseWord(String input) {
        if (input != null) {
            String s = null;
            for (int i = 0; i < input.length(); i++) {

            }
            System.out.print(s);
        }
    }

    // Сортировка массива строк по алфавиту
    public static void sortByAlfabit(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (Character.toLowerCase(charArray[j]) < Character.toLowerCase(charArray[i])) {

                    // swap symbols
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        System.out.println ("Отсортированная строка " + String.valueOf (charArray));
    }

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

    // Замена подстроки в строке
    public static void replaceWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите что нибудь");
        String oldInput = scanner.nextLine();

        if (oldInput != null) {
            System.out.println(oldInput + "\nВведите слово чтобы изменить предыдущую");
            String newInput = scanner.nextLine();

            if (oldInput.contains(newInput)) {
                for (int i = 0; i < oldInput.length(); i++) {
                    //String text = String.valueOf(oldInput.charAt(i));
                    String str = String.valueOf(oldInput.indexOf(5, oldInput.length()));

                }

                System.out.println("Введите новую слову");
                newInput = scanner.nextLine();

                System.out.println(oldInput.replace(oldInput, newInput));
            }

        }
    }

    // Определить длину самого короткого слова в строке

    // Добавление пробелов в строку

    // Количество вхождений подстроки в строку

    // Является ли строка палиндром?

    // Расстояние между подстроками

    // Частота встречаемости символа в строке

    public static void main(String[] args) {
        System.out.println("Enter characters");
        String enter = scanner.nextLine();

        symbols(enter);

        //removeDuplicateCharacters(enter);

        //quantityOfNumbers(enter);

        //quantityOfWord(enter);

        //reverseString(enter);

        //reverseWord(enter);

        //replaceWords();

        //sortByAlfabit(enter);
    }
}

