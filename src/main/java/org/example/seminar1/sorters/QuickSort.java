package org.example.seminar1.sorters;

public class QuickSort extends AbstractSorter{
    public QuickSort(int[] numere) {
        super(numere);
    }

    public static void swap(int[] numere, int i, int j){
        int temp = numere[i];
        numere[i] = numere[j];
        numere[j] = temp;
    }

    public static int partition(int[] numere, int high, int low){
        int pivot = numere[high];

        int i = low - 1;

        for(int j = low; j <= high - 1; j++){
            if(numere[j] < pivot){
                i++;
                swap(numere, i, j);
            }
            swap(numere, i + 1, high);
        }
        return i + 1;
    }

    public static void QuickSorter(int[] numere, int low, int high){
        if(low < high){
            int part = partition(numere, low, high);
            QuickSorter(numere, low, part - 1);
            QuickSorter(numere, part + 1, high);
        }
    }

    @Override
    public void sort() {
        QuickSorter(numere, 0, numere.length - 1);
    }
}
