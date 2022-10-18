package testArlgorithm;

public class insertionsort {
    public static void main(String []args){
        int[] array = {1,9,6,5,8,10,50,30,55,66,89,101,45,99,109,509,33,456,109};
        int [] newArray = insertionSortMethod(array);
        for (int i = 0 ; i<newArray.length; i++ ){
            System.out.println(newArray[i]+ "");
        }
    }
    public static int[] insertionSortMethod(int[] array){
        int n = array.length;
        for (int i  = 1; i < n ;i++ ){
            int key = array [i];
            int j  = i - 1 ;
            while (j >= 0 && array[j]>key){
                array[j +1 ] = array[j];
                j--;
            }
            array[j+1]= key;
        }
        return array;
    }
}
