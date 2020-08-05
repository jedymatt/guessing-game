package lib;

public class GuessGame {

    private String[] items;
    private String[] choosenItems;
    private String[] currentGuess;

    public GuessGame(int numItems, int numChoosenItems) {
        items = WordLibrary.getWordsFromList(numItems);
        choosenItems = WordLibrary.getWords(items, numChoosenItems);
        currentGuess = new String[numChoosenItems];
    }

    public GuessGame() {
        this(6, 3);
    }

    public String[] getItems() {
        return items;
    }

    public String[] getChoosenItems() {
        return choosenItems;
    }

    public String[] getCurrentGuess() {
        return currentGuess;
    }

    public boolean isCorrectGuess() {
        return correctGuessItem() == 3 && correctGuessLocation() == 3;
    }

    public int correctGuessItem() {
        return Checker.correctItem(choosenItems, currentGuess);
    }

    public int correctGuessLocation() {
        return Checker.correctLocation(choosenItems, currentGuess);
    }

    public void addGuessItem(String guessItem) {
        for (int i = 0; i < currentGuess.length; i++) {
            if (currentGuess[i] == null) {
                currentGuess[i] = guessItem;
                break;
            } else if (currentGuess[i].equals(guessItem)) {
                break;
            }
        }
    }

    public void restart() {
        items = WordLibrary.getWordsFromList(items.length);
        choosenItems = WordLibrary.getWords(items, choosenItems.length);
        currentGuess = new String[choosenItems.length];
    }

    public void clearCurrentGuess() {
        currentGuess = new String[choosenItems.length];
    }

    public void printStringArray(String[] arr) {
        System.out.println(java.util.Arrays.toString(arr));
    }
}
