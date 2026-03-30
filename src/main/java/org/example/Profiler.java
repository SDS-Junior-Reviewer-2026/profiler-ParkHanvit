package org.example;

import org.example.sortMethods.SortInterface;

import java.util.ArrayList;

public class Profiler {
    // TODO : Profiler 구현
    private ArrayList<Integer> sortData;
    SortInterface sortLib;

    public void setData(ArrayList<Integer> data) {
        this.sortData = data;
    }

    public void setLib(SortInterface lib) {
        this.sortLib = lib;
    }

    public void runLib() {
        sortLib.sort(sortData);
    }

    public void showResult() {
        System.out.println("=========================================================");
        System.out.println("Name: " + sortLib.getName());
        System.out.println("After Sort: " + sortData);
        System.out.println("Change Count: " + sortLib.getChangeCnt());
        System.out.println("=========================================================");
    }
}
