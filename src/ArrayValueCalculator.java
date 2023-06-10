public class ArrayValueCalculator {
    public static int doCalc(String[][] array)
            throws ArraySizeException, ArrayDataException {

        int count = 0;

        if (4 != array.length) throw new ArraySizeException();
        for (int i = 0; i < array.length; i++) {

            if (4 != array[i].length) throw new ArraySizeException();
            for (int j = 0; j < array[i].length; j++) {

                try {
                    count += Integer.parseInt(array[i][j]);

                } catch (NumberFormatException e) {
                    throw new ArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}

class myException extends Exception {
    myException(String message) {
        super(message);
    }
}

class ArrayDataException extends myException {

    ArrayDataException(int row, int col) {
        super(String.format("Incorrectly data [%d, %d]", row, col) + ".");
    }
}

class ArraySizeException extends myException {

    ArraySizeException() {
        super("Incorrectly array length!");
    }
}

