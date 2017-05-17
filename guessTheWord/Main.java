package guessTheWord;

import java.util.Arrays;
//import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final String GUESS_WORD_STRING = "Ваша задача угадать загаданое слово.";
    private static final String GUESS_WORD_FROM_ARRAY = "Я загадал одно слово из этого массива:";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Computer comp = new Computer(words);
        System.out.println(GUESS_WORD_FROM_ARRAY);
        System.out.println(Arrays.toString(words));
        System.out.println(GUESS_WORD_STRING);
        System.out.println(comp.getSecretWord()); //для тестирования
        boolean win = false;
        while (!win) {
            String my_guess = scanner.nextLine();
            if (comp.isEqualTo(my_guess)) {
                System.out.println("Вы угадали!");
                win = true;
            } else {
                comp.playLevel(my_guess);
            }
        }
    }


}
