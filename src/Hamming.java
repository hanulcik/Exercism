public class Hamming {

    public String left;
    public String right;

    public Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        if (leftStrand.length() == 0 && rightStrand.length() != 0) throw new IllegalArgumentException("left strand must not be empty.");
        if (rightStrand.length() == 0 && leftStrand.length() != 0) throw new IllegalArgumentException("right strand must not be empty.");
        if (leftStrand.length() != rightStrand.length()) throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        this.left = leftStrand;
        this.right = rightStrand;
    }

    public int getHammingDistance() {
        int errors = 0;
        char[] leftArr = left.toCharArray();
        char[] rightArr = right.toCharArray();
        for (int i = 0; i < left.length(); i++) if (leftArr[i] != rightArr[i]) errors++;
        return errors;
    }

}
