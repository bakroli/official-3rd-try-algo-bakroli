package hu.nive.ujratervezes.addminimum;

public class AddMinimum {

    public int[] addMinimum(int[] numbers, int n) {
        if (numbers == null || n < 1) {
            throw new IllegalArgumentException();
        }
        if (numbers.length == 0) {
            return new int[0];
        }
        int minimunNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (minimunNumber > numbers[i]) {
                minimunNumber = numbers[i];
            }
        }
        int[] resultArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if ((i + 1) % n == 0) {
                resultArray[i] = minimunNumber + numbers[i];
            } else {
                resultArray[i] = numbers[i];
            }
        }
        return resultArray;
    }

}
