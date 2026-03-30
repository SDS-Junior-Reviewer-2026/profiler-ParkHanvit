package org.example.sortMethods;
import java.util.ArrayList;

public class SelectionSort implements SortInterface {
    private int changeCnt = 0;

    public SelectionSort() {
    }

    // selection sort 오름차순 예시코드
    private void selectionSort(ArrayList<Integer> arr) {
        changeCnt = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    changeCnt++;
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
    }

    @Override
    public int getChangeCnt() {
        return changeCnt;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }

    @Override
    public void sort(ArrayList<Integer> arr) {
        selectionSort(arr);
    }

}