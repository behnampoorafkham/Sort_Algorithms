public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{1,6,9,4,3,6,9,90,4,3,5,7,9,54,53,25,8,6,412,4,64,364124,79,3};

        int[] bouble = BubbleSort.sort(array);

        int[] heap = BubbleSort.sort(array);

        int[] insert = InsertionSort.sort(array);

        int[] merge = MergeSort.mergeSort(array,array.length);

        int[] quick = QuickSort.sort(array,0,array.length-1);

        int[] select = SelectionSort.sort(array);

        for (int item:select){
            System.out.println(item);
        }

    }
}
