public class PangramChecker {

    public boolean isPangram(String input) {
        input = input.toLowerCase();
        int ascii = 97;
        while (ascii < 123) {
            if (input.indexOf((char) ascii) == -1) return false;
            ascii++;
        }
        return true;
    }
}
