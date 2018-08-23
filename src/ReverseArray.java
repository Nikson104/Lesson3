import java.util.Arrays;


public class ReverseArray {
    public static void main(String[] args) {
        int [] array = {1,2,7,6,2,4,1,8,6,7};
        System.out.println("Original array: " + Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array [i];
            array [i] = array [array.length - 1 - i];
            array [array.length - 1 - i] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(array));
    }
}
