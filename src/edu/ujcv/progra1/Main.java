package edu.ujcv.progra1;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] Arreglo = new int[10000];

        for (int i = 0; i < Arreglo.length; i++) {
            int temp = (int) (Math.random() * 10000) + 1;
            Arreglo[i] = temp;
        }

        CycleSort c = new CycleSort();
        c.cycleSort(Arreglo);

        MergeSort m = new MergeSort();
        MergeSort.mergeSort(Arreglo);

        HeapSort h = new HeapSort();
        HeapSort.heapSort(Arreglo);

        BubbleSort b = new BubbleSort();
        BubbleSort.bubbleSort(Arreglo);

        //ShuffleSort s = new ShuffleSort();
        //ShuffleSort.shuffleSort(Arreglo);


        System.out.println("-------------------PROYECTO ESTRUCTURAS DE DATOS---------------------------");
        System.out.println("--------------------------DOUGLAS HEDMAN-----------------------------------");
        System.out.println("---------------------------2DO PARCIAL-------------------------------------");
        System.out.println("---------------------------20/03/2020--------------------------------------");


        System.out.println("\nElementos a Ordenar por cada Algoritmo [Arreglo]: ");
        System.out.println(Arrays.toString(Arreglo));

        System.out.println("\n\nEl Algoritmo CycleSort tardó: " + c.sort(Arreglo) + " Nanosegundos en ordenar el Arreglo.");
        System.out.println("El Algoritmo MergeSort tardó: " + m.sort(Arreglo) + " Nanosegundos en ordenar el Arreglo.");
        System.out.println("El Algoritmo HeapSort tardó: " + h.sort(Arreglo) + " Nanosegundos en ordenar el Arreglo.");
        System.out.println("El Algoritmo BubbleSort tardó: " + b.sort(Arreglo) + " Nanosegundos en ordenar el Arreglo.");
        //System.out.println("El Algoritmo ShuffleSort tardó: " + s.sort(Arreglo) + " Nanosegundos en ordenar el Arreglo.");

        System.out.println("\n\n--------------------PROMEDIO DE CADA ALGORTIMO-----------------------------");

        int [] Arreglo1 = new int[100];
        int [] Arreglo2 = new int[100];
        int [] Arreglo3 = new int[100];
        int [] Arreglo4 = new int[100];
        int [] Arreglo5 = new int[100];

        for (int i = 0; i < Arreglo1.length; i++) {
            int temp = (int) (Math.random() * 10000) + 1;
            Arreglo1[i] = temp;
            Arreglo2[i] = temp;
            Arreglo3[i] = temp;
            Arreglo4[i] = temp;
            Arreglo5[i] = temp;
        }

        CycleSort v = new CycleSort();
        MergeSort w = new MergeSort();
        HeapSort x = new HeapSort();
        BubbleSort y = new BubbleSort();
        ShuffleSort z = new ShuffleSort();

        long tiempo1 = v.sort(Arreglo1);
        long tiempo2 = v.sort(Arreglo2);
        long tiempo3 = v.sort(Arreglo3);
        long tiempo4 = v.sort(Arreglo4);
        long tiempo5 = v.sort(Arreglo5);
        double promedio1 = tiempo1+tiempo2+tiempo3+tiempo4+tiempo5;
        System.out.println("\nEl Promedio del CycleSort es de: " + (promedio1/5+ " Nanosegundos"));

        long time1 = w.sort(Arreglo1);
        long time2 = w.sort(Arreglo2);
        long time3 = w.sort(Arreglo3);
        long time4 = w.sort(Arreglo4);
        long time5 = w.sort(Arreglo5);
        double promedio2 = time1+time2+time3+time4+time5;
        System.out.println("El Promedio del MergeSort Sort es de: " + (promedio2/5+ " Nanosegundos"));

        long timing1 = x.sort(Arreglo1);
        long timing2 = x.sort(Arreglo2);
        long timing3 = x.sort(Arreglo3);
        long timing4 = x.sort(Arreglo4);
        long timing5 = x.sort(Arreglo5);
        double promedio3 = timing1+timing2+timing3+timing4+timing5;
        System.out.println("El Promedio del HeapSort Sort es de: " + (promedio3/5+ " Nanosegundos"));

        long timings1 = y.sort(Arreglo1);
        long timings2 = y.sort(Arreglo2);
        long timings3 = y.sort(Arreglo3);
        long timings4 = y.sort(Arreglo4);
        long timings5 = y.sort(Arreglo5);
        double promedio4 = timings1+timings2+timings3+timings4+timings5;
        System.out.println("El Promedio del BubbleSort Sort es de: " + (promedio4/5+ " Nanosegundos"));

        /*long timin1 = z.sort(Arreglo1);
        long timin2 = z.sort(Arreglo2);
        long timin3 = z.sort(Arreglo3);
        long timin4 = z.sort(Arreglo4);
        long timin5 = z.sort(Arreglo5);
        double promedio5 = timin1+timin2+timin3+timin4+timin5;
        System.out.println("El Promedio del ShuffleSort Sort es de: " + (promedio5/5+ " Nanosegundos"));*/

        System.out.println("\n---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
    }
}

