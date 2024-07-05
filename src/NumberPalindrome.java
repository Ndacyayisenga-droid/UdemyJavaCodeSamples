public class  NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int originalNumber = number;

        int reverse = 0;


        number = Math.abs(number);

        while (number > 0) {

            int lastDigit = number % 10;

            reverse = (reverse * 10) + lastDigit;

            number /= 10;
        }

        return reverse == Math.abs(originalNumber);
    }
}
