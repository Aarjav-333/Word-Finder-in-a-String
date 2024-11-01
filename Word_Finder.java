import java.util.Scanner;

class Word {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a sentence");
        String s = sc.nextLine().trim();
        String[] words = s.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.toLowerCase().equals("Enter_the_word_to_find")) {
                count++;
            }
        }

        System.out.println("The number of 'the' word: " + count);
    }
}
