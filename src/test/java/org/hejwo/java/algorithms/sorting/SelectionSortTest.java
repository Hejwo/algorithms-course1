package org.hejwo.java.algorithms.sorting;

import java.util.List;
import java.util.StringJoiner;

import org.hejwo.java.algorithms.sorting.selectionsort.SelectionSort;
import org.junit.Test;

import com.google.common.collect.Lists;

import static org.assertj.core.api.Assertions.assertThat;

public class SelectionSortTest {

    @Test
    public void sort() {
        List<Integer> unsorted = Lists.newArrayList(8, 7, 1, 2, 4, 3, 6, 5);

        List<Integer> sorted = SelectionSort.sort(unsorted);

        assertThat(sorted).containsExactly(1, 2, 3, 4, 5, 6, 7, 8);
    }

    @Test
    public void mergeSort() {
        List<Integer> unsorted = Lists.newArrayList(32, 1, 2, 4, 3, 6, 7, 8, 5);

        List<Integer> sorted = SelectionSort.sort(unsorted);
        printResult(sorted);

        assertThat(sorted).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 32);
    }

    @Test
    public void sort_shouldHandleSimpleCase() {
        List<Integer> unsorted = Lists.newArrayList(8, 7, 1, 2, 4, 3, 6, 5);

        List<Integer> sorted = SelectionSort.sort(unsorted);

        assertThat(sorted).containsExactly(1, 2, 3, 4, 5, 6, 7, 8);
    }

    @Test
    public void sort_shouldReturnSorted_whenAlreadySorted() {
        List<Integer> unsorted = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> sorted = SelectionSort.sort(unsorted);

        assertThat(sorted).containsExactly(1, 2, 3, 4, 5, 6, 7, 8);
    }

    @Test
    public void sort_shouldReturnSameOne_whenEmpty() {
        List<Integer> unsorted = Lists.newArrayList();

        List<Integer> sorted = SelectionSort.sort(unsorted);

        assertThat(sorted).isEqualTo(unsorted);
    }

    @Test
    public void sort_shouldReturnSameOne_whenSingleElement() {
        List<Integer> unsorted = Lists.newArrayList(124);

        List<Integer> sorted = SelectionSort.sort(unsorted);

        assertThat(sorted).isEqualTo(unsorted);
    }

    @Test
    public void sort_shouldReturnSameOne_whenNull() {
        List<Integer> unsorted = null;

        List<Integer> sorted = SelectionSort.sort(unsorted);

        assertThat(sorted).isEqualTo(unsorted);
    }

    private void printResult(List<Integer> sorted) {
        StringJoiner stringJoiner = new StringJoiner(",");
        sorted.forEach(val -> stringJoiner.add(val.toString()));
        System.out.println(stringJoiner.toString());
    }
    

}