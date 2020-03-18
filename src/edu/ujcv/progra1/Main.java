package edu.ujcv.progra1;
public class Main {

    public static void main(String[] args) {


        int[] elementos ={3,92,84,52,94,62,97,98,22,81,82,59,26,80,97,90,53,27,38,71,1,75,96,34,24,63,59,93,13,16,49,61,85,39,55,3,27,8,46,18,51,26,65,93,75,23,99,2,61,30,0,93,22,41,89,48,97,31,89,93,40,4,99,8,31,87,66,81,39,0,89,16,52,8,28,55,60,7,10,85,37,33,86,8,63,19,77,72,11,93,19,50,60,43,35,62,96,86,94,36};


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
        elementos = new int[]{9,7,5,1,16,7,9,8,10,13,2,15,10};
        System.out.println("\n\nTarda "+ s.sort(elementos)+ " Nanosegundos");
    }
}