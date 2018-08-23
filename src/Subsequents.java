public class Subsequents {
    public static void main(String[] args) {
        boolean error = false;
        int digit = 123;
        String number = Integer.toString(digit);
        int [] simpleDigit = new int[number.length()];
        for(int i = 0; i < number.length(); i++){
            simpleDigit[i] = new Integer(number.charAt(i)-'0');
        }
        for (int i = 1; i < simpleDigit.length; i++) {
            if (simpleDigit[i-1] >= simpleDigit [i]) {
                error = true;
                break;
            }
        }
        if (error) {
            System.out.println("Цифры не образуют строго возрастающую последовательность");
        } else {
            System.out.println("Цифры образуют строго возрастающую последовательность");
        }
    }
}
