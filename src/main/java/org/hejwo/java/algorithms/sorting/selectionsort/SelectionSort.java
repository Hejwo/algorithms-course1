package org.hejwo.java.algorithms.sorting.selectionsort;

import java.util.List;
import java.util.Optional;

import com.google.common.collect.Lists;

import static org.apache.commons.collections4.CollectionUtils.isEmpty;

public class SelectionSort {

    public static List<Integer> sort(List<Integer> unsorted) {
        if(isEmpty(unsorted) || unsorted.size() == 1) {
            return unsorted;
        }

        List<Integer> sorted = Lists.newArrayList();

        List<Integer> unsortedHelper = Lists.newArrayList(unsorted);
        unsorted.iterator().forEachRemaining(next -> {
            Optional<Integer> min = findMin(unsortedHelper);
            min.ifPresent(aMin -> {
                sorted.add(aMin);
                unsortedHelper.remove(unsortedHelper.indexOf(aMin));
            });
        });
        return sorted;
    }

    private static Optional<Integer> findMin(List<Integer> list) {
        if(isEmpty(list)) {
            return Optional.empty();
        }

        if(list.size() == 1) {
            return Optional.of(list.get(0));
        }
        Integer min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            Integer currentNumber = list.get(i);
            if(currentNumber < min) {
                min = currentNumber;
            }
        }
        return Optional.of(min);
    }

}
