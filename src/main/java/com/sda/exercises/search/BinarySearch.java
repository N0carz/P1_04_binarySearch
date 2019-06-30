package com.sda.exercises.search;

import java.util.List;

public class BinarySearch {

    public int search(List<Integer> list, Integer searched) {
        return searchBinary(list, 0, list.size() - 1, searched);
    }

    private int searchBinary(List<Integer> list, int left, int right, int searched) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) == searched) {
                return mid;
            }

            if (list.get(mid) > searched) {
                return searchBinary(list, left, mid -1, searched);
            } else {
                return searchBinary(list, mid + 1, right, searched);
            }
        }
        return -1;
    }
}
