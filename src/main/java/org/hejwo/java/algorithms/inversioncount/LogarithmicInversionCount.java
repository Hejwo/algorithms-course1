package org.hejwo.java.algorithms.inversioncount;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.tuple.Pair;
import org.hejwo.java.algorithms.sorting.mergesort.utils.Utils;

import java.util.List;
import java.util.Optional;

import static java.util.Objects.nonNull;


public class LogarithmicInversionCount {

    public static Pair<List<Integer>, Integer> countInversions(List<Integer> collection) {
        if (nonNull(collection) && collection.size() == 1) {
            return Pair.of(collection, 0);
        } else {
            Pair<List<Integer>, List<Integer>> splitted = Utils.splitIntoTwo(collection);
            Pair<List<Integer>, Integer> left = countInversions(splitted.getLeft());
            Pair<List<Integer>, Integer> right = countInversions(splitted.getRight());
            return mergeResults(Pair.of(left, right));
        }
    }

    static Pair<List<Integer>, Integer> mergeResults(Pair<Pair<List<Integer>, Integer>, Pair<List<Integer>, Integer>> splitted) {
        List<Integer> result = Lists.newArrayList();
        List<Integer> left = splitted.getLeft().getLeft();
        List<Integer> right = splitted.getRight().getLeft();

        int inversions = 0;

        int i = 0;
        int j = 0;
        for (int k = 0; k < left.size() + right.size(); k++) {
            Optional<Integer> leftValue = safeGet(left, i);
            Optional<Integer> rightValue = safeGet(right, j);

            if (areBothValuesPresent(leftValue, rightValue) && leftValue.get() < rightValue.get()) {
                i = addToResult(result, leftValue.get(), i);
            }

            if (areBothValuesPresent(leftValue, rightValue) && rightValue.get() < leftValue.get()) {
                j = addToResult(result, rightValue.get(), j);
                inversions += right.size() - j;
                // todo
            }

            if (!areBothValuesPresent(leftValue, rightValue) && leftValue.isPresent()) {
                i = addToResult(result, leftValue.get(), i);
            }

            if (!areBothValuesPresent(leftValue, rightValue) && rightValue.isPresent()) {
                j = addToResult(result, rightValue.get(), j);
            }
        }

        System.out.println(inversions);

        return Pair.of(result, 0);
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
