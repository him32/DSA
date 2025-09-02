public class DecimaToBinary {
    public static void main(String[] args) {

        System.out.println(toBinary(18));
    }

    public static String toBinary(int n) {
        String bin = " ";
        if (n == 0) return "0";
        while (n > 0) {
            int temp = n % 2;
            n = n / 2;
            bin += temp;
        }
        int i = bin.length() - 1;
        String a = "";
        while (i >= 0) {
            a += bin.charAt(i);
            i--;
        }

        return a;
    }
}
