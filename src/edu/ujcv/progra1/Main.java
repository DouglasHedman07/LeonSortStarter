package edu.ujcv.progra1;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------EVALUADOR DE ALGORITMOS------------------------------");
        System.out.println("-----------------------ESTRUCTURAS DE DATOS--------------------------------");
        System.out.println("---------------------------23/03/2020--------------------------------------");

        LectorDeArreglos la = new LectorDeArreglos();
        System.out.println("\n\n----------------TIEMPO INDIVIDUAL DE CADA ALGORTIMO------------------------");
        int z1 = la.leerTamano("\nIngrese el Tamaño del Arreglo con que desea realizar la Prueba: ", "Ingrese un numero valido, Intente de nuevo");
        int z4 = la.leerTamano("\nIngrese el Rango de los Numeros que comprenderan el Arreglo: ", "Ingrese un numero valido, Intente de nuevo");
        int[] Arreglo = new int[z1];
        for (int i = 0; i < Arreglo.length; i++) {
            int temp = (int) (Math.random() * z4) + 1;
            Arreglo[i] = temp;
        }

        CycleSort c = new CycleSort();
        c.cycleSort(Arreglo);

        MergeSort m = new MergeSort();
        MergeSort.mergeSort(Arreglo);

        HeapSort h = new HeapSort();
        HeapSort.heapSort(Arreglo);

        BubleSort b = new BubleSort();
        BubleSort.bubleSort(Arreglo);


        System.out.println("\nElementos a Ordenar por cada Algoritmo [Arreglo]: ");
        System.out.println(Arrays.toString(Arreglo));

        System.out.println("\n\nEl Algoritmo CycleSort tardó: " + c.sort(Arreglo) + " Milisegundos en ordenar el Arreglo.");
        System.out.println("El Algoritmo MergeSort tardó: " + m.sort(Arreglo) + " Milisegundos en ordenar el Arreglo.");
        System.out.println("El Algoritmo HeapSort tardó: " + h.sort(Arreglo) + " Milisegundos en ordenar el Arreglo.");
        System.out.println("El Algoritmo BubbleSort tardó: " + b.sort(Arreglo) + " Milisegundos en ordenar el Arreglo.");

        System.out.println("\n\n--------------------PROMEDIO DE CADA ALGORTIMO-----------------------------");
        int z2 = la.leerTamano("\nIngrese el Tamaño de los Arreglos con los que desea obtener el Promedio: ", "Ingrese un numero valido, Intente de nuevo");
        int z5 = la.leerTamano("\nIngrese el Rango de los Numeros que comprenderan los Arreglos: ", "Ingrese un numero valido, Intente de nuevo");
        int[] Arreglo1 = new int[z2];
        int[] Arreglo2 = new int[z2];
        int[] Arreglo3 = new int[z2];
        int[] Arreglo4 = new int[z2];
        int[] Arreglo5 = new int[z2];

        for (int i = 0; i < Arreglo1.length; i++) {
            int temp = (int) (Math.random() * z5) + 1;
            Arreglo1[i] = temp;
            Arreglo2[i] = temp;
            Arreglo3[i] = temp;
            Arreglo4[i] = temp;
            Arreglo5[i] = temp;
        }
        CycleSort v = new CycleSort();
        MergeSort w = new MergeSort();
        HeapSort x = new HeapSort();
        BubleSort y = new BubleSort();

        long tiempo1 = v.sort(Arreglo1);
        long tiempo2 = v.sort(Arreglo2);
        long tiempo3 = v.sort(Arreglo3);
        long tiempo4 = v.sort(Arreglo4);
        long tiempo5 = v.sort(Arreglo5);
        double promedio1 = tiempo1 + tiempo2 + tiempo3 + tiempo4 + tiempo5;
        System.out.println("\nEl Promedio del CycleSort es de: " + (promedio1 / 5 + " Milisegundos"));

        long time1 = w.sort(Arreglo1);
        long time2 = w.sort(Arreglo2);
        long time3 = w.sort(Arreglo3);
        long time4 = w.sort(Arreglo4);
        long time5 = w.sort(Arreglo5);
        double promedio2 = time1 + time2 + time3 + time4 + time5;
        System.out.println("El Promedio del MergeSort Sort es de: " + (promedio2 / 5 + " Milisegundos"));

        long timing1 = x.sort(Arreglo1);
        long timing2 = x.sort(Arreglo2);
        long timing3 = x.sort(Arreglo3);
        long timing4 = x.sort(Arreglo4);
        long timing5 = x.sort(Arreglo5);
        double promedio3 = timing1 + timing2 + timing3 + timing4 + timing5;
        System.out.println("El Promedio del HeapSort Sort es de: " + (promedio3 / 5 + " Milisegundos"));

        long timings1 = y.sort(Arreglo1);
        long timings2 = y.sort(Arreglo2);
        long timings3 = y.sort(Arreglo3);
        long timings4 = y.sort(Arreglo4);
        long timings5 = y.sort(Arreglo5);
        double promedio4 = timings1 + timings2 + timings3 + timings4 + timings5;
        System.out.println("El Promedio del BubbleSort Sort es de: " + (promedio4 / 5 + " Milisegundos"));

        System.out.println("\n---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");

        int z3 = la.leerTamano("\nDesea realizar una Nueva Evaluación? " + "\n1. Si" + "\n2. No", "Por Favor, Ingrese una Opcion Valida");
        switch (z3) {
            case 1:
                main (null);
                break;
            case 2:
                System.out.println("----------------GRACIAS POR UTILIZAR EL PROGRAMA---------------------------");
                break;
        }
    }
}
