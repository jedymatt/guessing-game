package lib;

public class Checker {

    private Checker() {

    }

    public static int correctItem(String[] arr, String inputGuess) {
        String[] input = inputGuess.split(" ");
        return correctItem(arr, input);
    }

    public static int correctItem(String[] arr, String[] inputGuess) {

        int value = 0;
        for (int i = 0; i < inputGuess.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (inputGuess[i].equals(arr[j])) {
                    ++value;
                }
            }
        }

        return value;
    }

    public static int correctLocation(String[] arr, String inputGuess) {
        String[] input = inputGuess.split(" ");
        return correctLocation(arr, input);
    }

    public static int correctLocation(String[] arr, String[] inputGuess) {
        int value = 0;
        for (int i = 0; i < inputGuess.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (inputGuess[i].equals(arr[j]) && i == j) {
                    ++value;
                }
            }
        }
        return value;
    }

}
