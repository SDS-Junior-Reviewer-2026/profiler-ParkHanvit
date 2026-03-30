package org.example;
import java.util.ArrayList;


// LEGACY: NO USAGES

public class Sort {
    private int changeCnt = 0;
    private String sortName = "";

    public Sort(String sortName) {
        this.sortName = sortName;
    }

    public void sort(ArrayList<Integer> arr) {
        System.err.println("NOT IMPLEMENTED");
    }

    public int getChangeCnt() {
        return changeCnt;
    }

    public String getSortName() {
        return sortName;
    }
}
