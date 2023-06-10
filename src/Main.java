public class Main {
        public static void main(String[] args) {

            String[][] correctMatrix = {
                    {"1", "2", "3", "4"},
                    {"8", "7", "6", "5"},
                    {"9", "1", "1", "2"},
                    {"6", "5", "4", "3"}};

            String[][] incorrectSizeMatrix = {
                    {"1", "2", "0", "3"},
                    {"6", "4", "1", "5"},
                    {"9", "2", "7", "4"},
                    {"0", "2"}};

            String[][] incorrectCharMatrix = {
                    {"1", "9", "2", "3"},
                    {"6", "1", "5", "7"},
                    {"2", "Z", "7", "6"},
                    {"1", "9", "4", "5"}};

            try {
                System.out.println("Sum of all array elements:  " +
                        ArrayValueCalculator.doCalc(correctMatrix) + ".");
            } catch (myException e) {
                e.getMessage();
            }
            try {
                System.out.println("Sum of all array elements:  " +
                        ArrayValueCalculator.doCalc(incorrectCharMatrix) + ".");
            } catch (myException e) {
                System.out.println(e.getMessage());
            }
            try {
                System.out.println("Sum of all array elements: " +
                        ArrayValueCalculator.doCalc(incorrectSizeMatrix) + ".");
            } catch (myException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println();
                System.out.println("Thank you Elizabeth for reading to the end.\n" +
                        "Have a good day!");
            }
        }
    }
