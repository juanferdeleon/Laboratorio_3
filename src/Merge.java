/**
 * Source code recreated from Lars Vogel (c) 2009, 2016 vogella GmbH
 * Version 0.7, 04.10.2016
 */

public class Merge {

    private int[] infoArray;
    private int[] tempArray;

    private int number;

    public int[] sort(int[] values) {
        this.infoArray = values;
        number = values.length;
        this.tempArray= new int[number];
        mergesort(0, number - 1);
        return this.infoArray;
    }

    private void mergesort(int low, int high) {
        // Verifica si low es menor que high, sino ordena la lista.
        if (low < high) {
            // Obtiene el indice del valor central del arreglo.
            int middle = low + (high - low) / 2;
            // Ordena el lado izquierdo de la lista
            mergesort(low, middle);
            // Ordena el lado izquierdo de la lista
            mergesort(middle + 1, high);
            // Junta los dos arreglos
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        // Copia ambas partes en el arrehlo heper
        for (int i = low; i <= high; i++) {
            tempArray[i] = infoArray[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copia los valores mas pequeños de ambos lados
        // al arreglo original
        while (i <= middle && j <= high) {
            if (tempArray[i] <= tempArray[j]) {
                infoArray[k] = tempArray[i];
                i++;
            } else {
                infoArray[k] = tempArray[j];
                j++;
            }
            k++;
        }
        // copia el resto del arreglo
        while (i <= middle) {
            infoArray[k] = tempArray[i];
            k++;
            i++;
        }
    }
}
