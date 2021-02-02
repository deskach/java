package l2.alphabet;

public class Main {
    public static void main(String[] args) {
        for(char c = '\u0410'; c < '\u0450'; c++) {
            System.out.printf("%c ", c);
        }

        System.out.println();

        for(char c = '\u0104'; c < '\u014a'; c++) {
            System.out.printf("%c ", c);
        }
    }
}
