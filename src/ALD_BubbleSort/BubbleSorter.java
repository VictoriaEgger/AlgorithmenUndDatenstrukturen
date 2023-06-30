package ALD_BubbleSort;

public class BubbleSorter {

    public void sort(int[] array){ // nimmt das array entgegen das sortiert werden soll
        for (int j = array.length; j > 1; j--){
            for (int i = 0; i < (j-1);i++){
                // Wenn das element größer ist als das nächste -> dann tauschen
                if (array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1]=temp;
                }
            }
        }
    }
}
