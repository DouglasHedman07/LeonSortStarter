package edu.ujcv.progra1;

public class CycleSort {
    public static void main(String[] args)
    {
        int[] array1 = {12, 11, 15, 10, 9, 1, 2, 3, 13, 14, 4, 5, 6, 7, 8};
        int[] array2 = {2, 1, 5, 2, 9, 1, 2, 3, 3, 4, 4, 5, 6, 7, 8};

        CycleSort sorter = new CycleSort();
        sorter.cycleSort(array1);
        sorter.cycleSort(array2);

        System.out.println(java.util.Arrays.toString(array1));
        System.out.println(java.util.Arrays.toString(array2));
    }