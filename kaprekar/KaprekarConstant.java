public class KaprekarConstant {

    public static int countSteps(int number) {
        int steps = 0;

        while (number != 6174) {
            int[] digits = new int[4];

            for (int i = 3; i >= 0; i--) {
                digits[i] = number % 10;
                number /= 10;
            }

            // sort digits ascending (manual)
            for (int i = 0; i < digits.length; i++) {
                for (int j = i + 1; j < digits.length; j++) {
                    if (digits[i] > digits[j]) {
                        int temp = digits[i];
                        digits[i] = digits[j];
                        digits[j] = temp;
                    }
                }
            }

            int small = 0;
            int large = 0;

            for (int i = 0; i < 4; i++) {
                small = small * 10 + digits[i];
                large = large * 10 + digits[3 - i];
            }

            number = large - small;
            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {
        int input = 3524;
        System.out.println("Steps to reach 6174: " + countSteps(input));
    }
}
