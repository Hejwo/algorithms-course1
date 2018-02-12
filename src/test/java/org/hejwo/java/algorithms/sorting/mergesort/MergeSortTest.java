package org.hejwo.java.algorithms.sorting.mergesort;

import java.util.List;
import java.util.StringJoiner;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;

import com.google.common.collect.Lists;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeSortTest {

    @Test
    public void mergeResults() {
        List<Integer> result1 = Lists.newArrayList(4, 5, 6);
        List<Integer> result2 = Lists.newArrayList(1, 2, 3);

        List<Integer> merged = MergeSort.mergeResults(Pair.of(result1, result2));
        printResult(merged);

        assertThat(merged).containsExactly(1, 2, 3, 4, 5, 6);
    }

    @Test
    public void mergeSort() {
        List<Integer> unsorted = Lists.newArrayList(32, 1, 2, 4, 3, 6, 7, 8, 5);

        List<Integer> sorted = MergeSort.sort(unsorted);
        printResult(sorted);

        assertThat(sorted).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 32);
    }

    @Test
    public void sort_shouldHandleSimpleCase() {
        List<Integer> unsorted = Lists.newArrayList(8, 7, 1, 2, 4, 3, 6, 5);

        List<Integer> sorted = MergeSort.sort(unsorted);

        assertThat(sorted).containsExactly(1, 2, 3, 4, 5, 6, 7, 8);
    }

    @Test
    public void sort_shouldReturnSorted_whenAlreadySorted() {
        List<Integer> unsorted = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> sorted = MergeSort.sort(unsorted);

        assertThat(sorted).containsExactly(1, 2, 3, 4, 5, 6, 7, 8);
    }

    @Test
    public void sort_shouldReturnSameOne_whenEmpty() {
        List<Integer> unsorted = Lists.newArrayList();

        List<Integer> sorted = MergeSort.sort(unsorted);

        assertThat(sorted).isEqualTo(unsorted);
    }

    @Test
    public void sort_shouldReturnSameOne_whenSingleElement() {
        List<Integer> unsorted = Lists.newArrayList(124);

        List<Integer> sorted = MergeSort.sort(unsorted);

        assertThat(sorted).isEqualTo(unsorted);
    }

    @Test
    public void sort_shouldReturnSameOne_whenNull() {
        List<Integer> unsorted = null;

        List<Integer> sorted = MergeSort.sort(unsorted);

        assertThat(sorted).isEqualTo(unsorted);
    }    

    private void printResult(List<Integer> sorted) {
        StringJoiner stringJoiner = new StringJoiner(",");
        sorted.forEach(val -> stringJoiner.add(val.toString()));
        System.out.println(stringJoiner.toString());
    }

}