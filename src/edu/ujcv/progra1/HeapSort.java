package edu.ujcv.progra1;

public class HeapSort implements SortTester {

    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        heapSort(array);
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static void heapSort(int[] array){

        int n = array.length;
        for (int i = n/2-1; i >= 0; i--) {
            Float(array, n, i);
        }
        Sink(array,n);
    }
    public static void Float(int[] arr, int n, int i){
        //Metodo Flotar con sus respectivos hijos y padre
        int father = i;
        int leftSon = i*2+1;
        int rightSon = i*2+2;

        if (leftSon < n && arr[leftSon]>arr[father]){
            father = leftSon;
        }
        if (rightSon < n && arr[rightSon]>arr[father]){
            father = rightSon;
        }
        if (father != i){
            int temp = arr[i];
            arr[i] = arr[father];
            arr[father] = temp;
            Float(arr,n,father);
        }
    }
    public static void Sink(int[] array, int n){
        //Metodo Hundir
        for (int i = n-1; i >=0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            Float(array,i,0);
        }
    }
}