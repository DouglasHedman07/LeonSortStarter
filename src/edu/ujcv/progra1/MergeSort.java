package edu.ujcv.progra1;
public class MergeSort implements SortTester{

    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        mergeSort(array);
        long end = System.nanoTime();
        return end - start;
    }

    static int[] mergeSort(int[] arr){
        if(arr.length <= 1){
            return arr;
        }

        int medio = arr.length /2;
        int[] inferior = new int[medio];
        int[] superior = new int[arr.length - medio];
        for (int i = 0; i < medio; i++) {
            inferior[i] = arr[i];
        }

        for (int i = 0; i < superior.length ; i++) {
            superior[i] = arr[i + inferior.length];
        }
        return  merge(mergeSort(inferior), mergeSort(superior));
    }
    private static int[] merge(int[] a, int[] b){
        int[] retval = new int[a.length+ b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (j < a.length && k < b.length ){
            if(a[j] < b[k]){
                retval[i++] = a[j++];
            }else{
                retval[i++] = b[k++];
            }
        }
        while (j < a.length){
            retval[i++] = a[j++];
        }
        while (k < b.length){
            retval[i++] = b[k++];
        }
        return retval;
    }
}