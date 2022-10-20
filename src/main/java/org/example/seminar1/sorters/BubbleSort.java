package org.example.seminar1.sorters;

public class BubbleSort extends AbstractSorter{
    public BubbleSort(int[] numere) {
        super(numere);
    }

    @Override
    public void sort() {
        for(int i = 0; i < numere.length - 1; i++){
            for(int j = 0; j < numere.length - i - 1; j++)
                if(numere[j] > numere[j + 1]){
                    int aux = numere[j];
                    numere[j] = numere[j + 1];
                    numere[j + 1] = aux;
                }
        }
        for (int i : numere) {
            System.out.println(i);
        }
    }
}
