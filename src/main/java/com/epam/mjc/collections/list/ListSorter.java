package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {

        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        double numA = Double.parseDouble(a);
        double numB = Double.parseDouble(b);

        if (checkFunk(numA) > checkFunk(numB)) {
            return 1;
        } else if (checkFunk(numA) < checkFunk(numB)) {
            return -1;
        } else if (checkFunk(numA) == checkFunk(numB)) {
            if (numA > numB) {
                return 1;
            } else if (numA < numB) {
                return -1;
            }
        }
        return 0;
    }

    private double checkFunk(Double a) {

        return 5 * Math.pow(a, 2) + 3;
    }
}
