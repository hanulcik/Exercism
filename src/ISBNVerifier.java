public class ISBNVerifier {

    boolean isValid(String stringToVerify) {
        stringToVerify = stringToVerify.replaceAll("-", "");
        if (stringToVerify.length() != 10) return false;
        char[] chArr = stringToVerify.toCharArray();
        int[] intArr = new int[stringToVerify.length()];

        for (int i = 0; i < stringToVerify.length(); i++) {
            if (chArr[i] == 'X') {
                intArr[i] = 10;
                break;
            }
            intArr[i] = Character.getNumericValue(chArr[i]);
        }

        int sum = 0;
        for (int i = 0, multiplier = 10; i < 10; i++, multiplier--) {
            sum += intArr[i] * multiplier;
        }

        return (sum % 11 == 0) ? true : false;

    }


}
