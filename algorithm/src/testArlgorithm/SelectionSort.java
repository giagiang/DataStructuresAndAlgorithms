package testArlgorithm;

public class SelectionSort {
    public static void main(String[]args){
        int[] array  = {6,10,0,32,99,88,1,-1,-2,-3,-4,8};
        int[] newArray = selectionShortMethod(array);
        for (int i = 0  ; i < newArray.length; i++){
            System.out.println(newArray[i] + " ");
        }
    }
    public static int[] selectionShortMethod(int[] array){
        int n = array.length;
        for (int j = 0; j < n -1 ; j++){
            int index = j;
            for (int i = j +1 ; i < n ; i++){
                if (array[i] < array[index]){
                    index = i;
                }
            }
            int tmp  = array[j];
            array[j] = array[index];
            array[index] = tmp;
        }
        return array;
    }
}
