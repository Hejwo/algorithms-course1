package org.hejwo.java.algorithms.sorting.mergesort;

import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.tuple.Pair;
import org.hejwo.java.algorithms.sorting.mergesort.utils.Utils;

import com.google.common.collect.Lists;

import static java.util.Objects.nonNull;


public class MergeSort {

    public static List<Integer> mergeSort(List<Integer> unsorted) {
        if (nonNull(unsorted) && unsorted.size() == 1) {
            return unsorted;
        } else {
            Pair<List<Integer>, List<Integer>> splitted = Utils.splitIntoTwo(unsorted);
            List<Integer> left = mergeSort(splitted.getLeft());
            List<Integer> right = mergeSort(splitted.getRight());
            return mergeResults(Pair.of(left, right));
        }
    }

    static List<Integer> mergeResults(Pair<List<Integer>, List<Integer>> splitted) {
        List<Integer> result = Lists.newArrayList();
        List<Integer> left = splitted.getLeft();
        List<Integer> right = splitted.getRight();

        int i = 0;
        int j = 0;
        for (int k = 0; k < left.size() + right.size(); k++) {
            Optional<Integer> leftValue = safeGet(left, i);
            Optional<Integer> rightValue = safeGet(right, j);

            if(areBothValuesPresent(leftValue, rightValue) && leftValue.get() < rightValue.get()) {
                i = addToResult(result, leftValue.get(), i);
            }

            if (areBothValuesPresent(leftValue, rightValue) && rightValue.get() < leftValue.get()) {
                j = addToResult(result, rightValue.get(), j);
            }

            if(!areBothValuesPresent(leftValue, rightValue) && leftValue.isPresent()) {
                i = addToResult(result, leftValue.get(), i);
            }

            if(!areBothValuesPresent(leftValue, rightValue) && rightValue.isPresent()) {
                j = addToResult(result, rightValue.get(), j);
            }
        }

        return result;
    }

    private static int addToResult(List<Integer> result, Integer value, int i) {
        result.add(value);
        i++;
        return i;
    }

    private static boolean areBothValuesPresent(Optional<Integer> leftValue, Optional<Integer> rightValue) {
        return leftValue.isPresent() && rightValue.isPresent();
    }

    private static <T> Optional<T> safeGet(List<T> left, int i) {
        return i < left.size() ? Optional.of(left.get(i)) : Optional.empty();
    }

}
