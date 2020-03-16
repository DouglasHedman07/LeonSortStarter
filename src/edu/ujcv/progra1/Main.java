package edu.ujcv.progra1;
public class Main {

    public static void main(String[] args) {


        int[] elementos ={0,42,1,23,99,91,71,42,39,17};


        CycleSort s = new CycleSort();
        s.cycleSort(elementos);

//        MergeSort s = new MergeSort();
//        s.mergeSort(elementos);

//        HeapSort s = new HeapSort();
//        s.heapSort(elementos);

//        BubleSort s = new BubleSort();
//        s.bubleSort(elementos);


        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }

        elementos = new int[]{3,2,4,5,6,7,9,9,10,3,5};
        System.out.println("\n\nTarda "+ s.sort(elementos)+ " Nanosegundos");
    }
}