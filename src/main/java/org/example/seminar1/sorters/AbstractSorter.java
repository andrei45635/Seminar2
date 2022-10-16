package org.example.seminar1.sorters;

import java.util.Arrays;

public abstract class AbstractSorter {

    protected int[] numere;

    public AbstractSorter(int[] numere) {
        this.numere = numere;
    }

    public int[] getNumere() {
        return numere;
    }

    @Override
    public String toString() {
        return "AbstractSorter{" +
                "numere=" + Arrays.toString(numere) +
                '}';
    }

    public abstract void sort();
}
