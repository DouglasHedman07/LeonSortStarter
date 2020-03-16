package edu.ujcv.progra1;
public class Main {

    public static void main(String[] args) {


        int[] elementos ={0,42,1,23,99,91,71,42,39,17};


//        CycleSort s = new CycleSort();
//        s.cycleSort(elementos);

//        MergeSort s = new MergeSort();
//        s.mergeSort(elementos);

//        HeapSort s = new HeapSort();
//        s.heapSort(elementos);

//        BubleSort s = new BubleSort();
//        s.bubleSort(elementos);
        

        for (int elemento : elementos) {
            System.out.println(elemento);
        }

        System.out.println("\n\nTarda "+ s.sort(elementos)+ " Nanosegundos");
    }
}