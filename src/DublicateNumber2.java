public class DublicateNumber2 {
    public static void main(String[] args) {
        int [] arr = new int []{9,0,2,2,1,3,9,1,2,3};
        int [] counter = new int [10];
        for (int i = 0; i < arr.length ; i++) {
            counter [arr [i]]++;
        }
        for (int i = 0; i < counter.length; i++) {
            System.out.println( "[" + i + "]" + " - повторений " + counter [i]);
        }
    }
}
