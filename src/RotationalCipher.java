public class RotationalCipher {

    public int shiftkey;

    RotationalCipher(int shiftKey) {
        this.shiftkey = shiftKey;
    }

    String rotate(String data) {
        StringBuilder sb = new StringBuilder();
        for (char ch : data.toCharArray()){
            int ascii = (int) ch;

            // capital letter
            if (ascii > 64 && ascii < 91) {
                for (int shift = shiftkey, count = 0; count < shift; count++) {
                    ascii++;
                    if (ascii == 91) ascii = 65;
                }
                ch = (char) ascii;
            }

            //lowercase letter
            else if (ascii > 96 && ascii < 123) {
                for (int shift = shiftkey, count = 0; count < shift; count++) {
                    ascii++;
                    if (ascii == 123) ascii = 97;
                }
                ch = (char) ascii;
            }

            sb.append(ch);
        }

        return sb.toString();
    }

}
