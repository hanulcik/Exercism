class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int n = 1;
        int sum = 0;
        while (n <= input) {
            sum += n;
            n++;
        }
        return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
        int n = 1;
        int sum = 0;
        while (n <= input) {
            sum += (n * n);
            n++;
        }
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
