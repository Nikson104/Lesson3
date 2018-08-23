import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int [] array = {1,2,1,3,4,3,5,10,10,11};
        for (int j = 0; j < array.length - 1; j++)
        {
            for (int k = j + 1; k < array.length; k++)
            {
                if (array[j] > array[k])
                {
                    int temp = array[k];
                    array[k] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
