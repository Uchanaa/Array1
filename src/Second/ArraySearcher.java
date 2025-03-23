package Second;

public class ArraySearcher {
    public static void findNumber(int[] array, int number) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("ნაპოვნია ინდექსზე: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("ვერ ვიპოვე");
        }
    }
}
