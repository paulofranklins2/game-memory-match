import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 10;
        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'));
        ArrayList<Integer> cards = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10));
        Collections.shuffle(cards);


        System.out.println(cards);
        while (counter > 0) {
            System.out.println(chars);

            System.out.println("Guess from 1-20");
            int guess1 = scanner.nextInt() - 1;

            System.out.println("Guess from 1-20");
            int guess2 = scanner.nextInt() - 1;

            if (cards.get(guess1).equals(cards.get(guess2)) && chars.get(guess1).equals('_') && chars.get(guess2).equals('_')) {
                chars.set(guess1, cards.get(guess1).toString().charAt(0));
                chars.set(guess2, cards.get(guess2).toString().charAt(0));
                counter = counter - 2;
            }


        }
    }
}