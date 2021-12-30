public class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replaceAll(" ", "");
        if (candidate.length() < 2) return false;
        int[] arr = new int[candidate.length()-1];
        for (int i = 0; i < candidate.length(); i++) arr[i] = candidate.charAt(i);
        for (int index = 0; index < candidate.length(); index += 2) {
            int k = arr[index];
            k = k * 2;
            if (k > 9) k = k - 9;
            arr[index] = k;
        }
        int total = 0;
        for (int i : arr) total += i;
        if (total % 10 == 0) return true;
        return false;

    }

}
