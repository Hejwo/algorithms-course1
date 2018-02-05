package org.hejwo.java.algorithms.sorting.mergesort.utils;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.tuple.Pair;

import com.google.common.collect.Lists;

import static java.util.Objects.isNull;

public class Utils {

    public static Pair<List<Integer>, List<Integer>> splitIntoTwo(List<Integer> list) {
        if (isShortList(list)) {
            return Pair.of(list, Lists.newArrayList());
        }

        int half = list.size() / 2;
        List<List<Integer>> partition = ListUtils.partition(list, half);

        if (partition.size() == 2) {
            return Pair.of(partition.get(0), partition.get(1));
        } else {
            List<Integer> secondPart = partition.subList(1, partition.size()).stream()
                .flatMap(Collection::stream).collect(Collectors.toList());
            return Pair.of(partition.get(0), secondPart);
        }
    }

    private static boolean isShortList(List<Integer> list) {
        return isNull(list) || list.size() < 2;
    }

    public static void insert(List<Integer> result, List<Integer> integers) {
        integers.forEach(i -> insert(result, i));
    }

    public static void insert(List<Integer> result, Integer integer) {
        if(!result.contains(integer)) {
            result.add(integer);
        }
    }


}
