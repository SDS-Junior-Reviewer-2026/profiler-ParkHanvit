package org.example;


import org.example.sortMethods.SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // TODO : Profiler 실행해보기
        Profiler profiler = new Profiler();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(52,15,27,92,26,3,6,8,32));
        profiler.setData(input);
        profiler.setLib(new SelectionSort());
        profiler.runLib();
        profiler.showResult();
    }
}