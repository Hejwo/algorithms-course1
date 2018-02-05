package org.hejwo.java.algorithms.sorting.insertionsort;

import java.util.LinkedList;
import java.util.List;

import com.google.common.collect.Lists;

import static java.util.Collections.singleton;
import static org.apache.commons.collections4.CollectionUtils.isEmpty;

public class InsertionSort {

    public static List<Integer> sort(List<Integer> unsorted) {
        if(isEmpty(unsorted) || unsorted.size() == 1) {
            return unsorted;
        }

        LinkedList<Integer> sorted = Lists.newLinkedList(singleton(unsorted.get(0)));

        for (int i = 1; i < unsorted.size(); i++) {
            Integer elementToPlace = unsorted.get(i);

            for (int k = 0; k < sorted.size(); k++) {
                Integer currentSorted = sorted.get(k);
                if(elementToPlace <= currentSorted) {
                    sorted.add(k, elementToPlace);
                    break;
                }
            }
        }

        return sorted;
    }

}
