package gguessTheWord;

        import java.util.Random;

public class Computer {
    private String[] words;
    private String secretWord;

    public Computer(String[] words) {
        this.words = words;
        Random random = new Random();
        secretWord = words[random.nextInt(words.length)];
    }

    public String getSecretWord() {
        return secretWord;
    }

    public void playLevel(String my_guess) {
        int minLengthWord = my_guess.length() < secretWord.length() ? my_guess.length() : secretWord.length();
        for (int i = 0; i < minLengthWord; i++) {
            if (my_guess.charAt(i) == secretWord.charAt(i)) {
                System.out.print(secretWord.charAt(i));
            } else {
                System.out.print("#");
            }
        }
        for (int i = 0; i < 15 - minLengthWord; i++) {
            System.out.print("#");
        }
        System.out.println();
    }

    public boolean isEquilTo(String guessWord){
        return guessWord.equals(secretWord);
    }
}
