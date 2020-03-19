package edu.ujcv.progra1;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] Arreglo = new int[15];

        for (int i = 0; i < Arreglo.length; i++) {
            int temp = (int) (Math.random() * 10000) + 1;
            Arreglo[i] = temp;
        }

        CycleSort c = new CycleSort();
        c.cycleSort(Arreglo);

        MergeSort m = new MergeSort();
        MergeSort.mergeSort(Arreglo);

        HeapSort h = new HeapSort();
        h.heapSort(Arreglo);

        BubbleSort b = new BubbleSort();
        BubbleSort.bubbleSort(Arreglo);


        System.out.println("-------------------PROYECTO ESTRUCTURAS DE DATOS---------------------------");
        System.out.println("--------------------------DOUGLAS HEDMAN-----------------------------------");
        System.out.println("---------------------------2DO PARCIAL-------------------------------------");
        System.out.println("---------------------------20/03/2020--------------------------------------");


        System.out.println("\nElementos a Ordenar por cada Algoritmo [Arreglo]: ");
        System.out.println(Arrays.toString(Arreglo));

        System.out.println("\n\nEl Algoritmo Cycle Sort tardó: " + c.sort(Arreglo) + " Nanosegundos en ordenar el Arreglo.");
        System.out.println("El Algoritmo Merge Sort tardó: " + m.sort(Arreglo) + " Nanosegundos en ordenar el Arreglo.");
        System.out.println("El Algoritmo Heap Sort tardó: " + h.sort(Arreglo) + " Nanosegundos en ordenar el Arreglo.");
        System.out.println("El Algoritmo Bubble Sort tardó: " + b.sort(Arreglo) + " Nanosegundos en ordenar el Arreglo.");

    }
}

