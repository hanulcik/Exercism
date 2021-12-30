public class LuhnValidatorV2 {

    boolean isValid(String candidate) {

        //remove everything from string except numbers
        candidate = candidate.replaceAll(" ", "");
        candidate = candidate.replaceAll("[^0-9]", "#");
        if (candidate.contains("#") || candidate.length() < 2) return false;

        //create int array and char array
        int[] intArr = new int[candidate.length()];
        char[] chArr = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) intArr[i] = Integer.parseInt(String.valueOf(chArr[i]));

        //iterate backwards through array
        for (int index = candidate.length() - 1, count = 1; index >= 0; index--, count++) {
            if (count % 2 == 0){
                if (intArr[index] * 2 > 9) intArr[index] = (intArr[index] * 2) - 9;
                else intArr[index] = intArr[index] * 2;
            }
        }

        //calculate sum
        int sum = 0;
        for (int i : intArr) sum += i;
        if (sum % 10 == 0) return true;
        return false;


    }

}
