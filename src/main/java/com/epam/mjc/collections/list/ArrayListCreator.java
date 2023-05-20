package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {

        ArrayList<String> res = new ArrayList<>();
        String tmp;
        ListIterator<String> iterator = sourceList.listIterator();

        while (iterator.hasNext()) {
            if ((iterator.nextIndex() + 1) % 3 == 0) {
                tmp = iterator.next();
                res.add(tmp);
                res.add(tmp);
            } else {
                iterator.next();
            }
        }
        return res;

    }
}
