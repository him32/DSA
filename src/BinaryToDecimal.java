public class BinaryToDecimal {
    public static void main(String[] args) {

        BinaryToDecimal("100011");
    }

    public static void BinaryToDecimal(String str) {
        int length = str.length();
        int power = length - 1;
        int total = 0;
        int i = 0;
        while (i <= length - 1) {
            int bit = str.charAt(i) - '0';

            total += (int) (Math.pow(2, power) * bit);
            power--;
            i++;


        }
        System.out.println(total);

    }
}
