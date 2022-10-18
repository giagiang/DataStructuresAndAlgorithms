package testArlgorithm;

public class BubbleSort {
    public static void main(String[] args){
        int[] array = {1,5,6,7,4,54,32,12,5790,30,44,25,33,80,79,59};
        int[] newArray = bubbleSortMethod(array);
        for(int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i] + "");
        }
    }
    public static int[]bubbleSortMethod(int[] array) {
        int n = array.length;
        for (int i = 0; i< n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp;
                    tmp  = array[j];
                    array[j]= array[j+1];
                    array[j+1] = tmp;

                }
            }
        }
        return array;
    }
}
