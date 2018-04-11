package org.hejwo.java.algorithms.sorting.insertionsort;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InsertionSortTest {

    @Test
    public void sort_shouldHandle_SimpleCase() {
        List<Integer> unsorted = Lists.newArrayList(8, 7, 1, 2, 4, 3, 6, 5);

        List<Integer> sorted = InsertionSort.sort(unsorted);

        assertThat(sorted).containsExactly(1, 2, 3, 4, 5, 6, 7, 8);
    }

    @Test
    public void sort_shouldReturnSorted_whenAlreadySorted() {
        List<Integer> unsorted = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> sorted = InsertionSort.sort(unsorted);

        assertThat(sorted).containsExactly(1, 2, 3, 4, 5, 6, 7, 8);
    }

    @Test
    public void sort_shouldReturnSameOne_whenEmpty() {
        List<Integer> unsorted = Lists.newArrayList();

        List<Integer> sorted = InsertionSort.sort(unsorted);

        assertThat(sorted).isEqualTo(unsorted);
    }

    @Test
    public void sort_shouldReturnSameOne_whenSingleElement() {
        List<Integer> unsorted = Lists.newArrayList(124);

        List<Integer> sorted = InsertionSort.sort(unsorted);

        assertThat(sorted).isEqualTo(unsorted);
    }

    @Test
    public void sort_shouldReturnSameOne_whenNull() {
        List<Integer> unsorted = null;

        List<Integer> sorted = InsertionSort.sort(unsorted);

        assertThat(sorted).isEqualTo(unsorted);
    }

}