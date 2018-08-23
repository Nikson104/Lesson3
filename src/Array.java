import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
	int [] numbers = {-9, 6, 1, -59, 123, 56, -1245, 60547, 124, 10, -1245};
	int min = numbers [0];
	int max = numbers [0];
	for(int i = 0; i < numbers.length; i++){
	    if (min > numbers[i])
	        min = numbers [i];
	    if (max < numbers [i])
	    	max = numbers [i];
    }
    System.out.println("Минимальное значение = " + min);
	System.out.println("Максимальное значение = " + max);

	for(int i = 0; i < numbers.length; i++){
		if(numbers[i] == min){
			numbers[i] = 0;
		}
		if(numbers[i] == max){
			numbers[i] = 99;
		}
	}
//	Arrays.sort (numbers);
//	numbers [0] = 0;
//	numbers [numbers.length - 1] = 99;
	System.out.println(Arrays.toString(numbers));
    }
}
