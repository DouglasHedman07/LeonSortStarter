package edu.ujcv.progra1;
public class CycleSort implements SortTester {

    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        cycleSort(array);
        long end = System.currentTimeMillis();
        return end - start;
    }

    void cycleSort(int[] array) {
        int pos;
        int item;
        int temp;
        for (int cycleStart = 0; cycleStart < array.length - 1; cycleStart++) {
            item = array[cycleStart];
            pos = cycleStart;
            //Busca la posicion donde esta el elemento y cuenta todos los elementos que son mas pequenos a su derecha
            for (int i = cycleStart + 1; i < array.length; i++) {
                if (array[i] < item)
                    pos++;
            }
            // Si el elemento esta en su posiion correcta
            if (pos == cycleStart)
                continue;
            // Ignore todos los elementos duplicados
            while (item == array[pos])
                pos++;
            // Poner el elemento en su posicion correcta
            if (item != array[pos]) {
                temp = array[pos];
                array[pos] = item;
                item = temp;
            }
            // Rotar el resto del arreglo
            while (pos != cycleStart) {
                pos = cycleStart;
                // Encontrar la posicion donde colocamos el elemento
                for (int i = cycleStart + 1; i < array.length; i++) {
                    if (array[i] < item)
                        pos++;
                }
                // Ignorar todos los elementos duplicados
                while (item == array[pos])
                    pos++;
                // Poner el elemento en su posicion correcta
                if (item != array[pos]) {
                    temp = array[pos];
                    array[pos] = item;
                    item = temp;
                }
            }
        }
    }
}
