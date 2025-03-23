package Second;

public class ArraySearcher {
    // მეთოდი, რომელიც ეძებს რიცხვს მასივში და ბეჭდავს მის ინდექსს
    public static void findNumber(int[] array, int number) {
        boolean found = false; // მონიშნავს, თუ ვიპოვეთ რიცხვი
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("ნაპოვნია ინდექსზე: " + i);
                found = true;
                break; // ვწყვეტთ ციკლს, რადგან რიცხვი უკვე ვიპოვეთ
            }
        }
        if (!found) {
            System.out.println("ვერ ვიპოვე");
        }
    }
}
