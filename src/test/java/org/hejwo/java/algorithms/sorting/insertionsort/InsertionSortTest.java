package org.hejwo.java.algorithms.sorting.insertionsort;

import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void sort() {
        List<Integer> unsorted = Lists.newArrayList(8, 7, 1, 2, 4, 3, 6, 5);

        List<Integer> sorted = InsertionSort.sort(unsorted);

        assertThat(sorted).containsExactly(1, 2, 3, 4, 5, 6, 7, 8);
    }

}