package First;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[10];

        for (int i = 0; i < words.length; i++) {
            words[i] = "სიტყვა " + (i + 1);
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
