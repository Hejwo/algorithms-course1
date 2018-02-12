package org.hejwo.java.algorithms.inversioncount;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LogarithmicInversionCountTest {

    @Test
    public void countInversions_shouldReturn3() {
        List<Integer> collection = com.google.common.collect.Lists.newArrayList(1, 3, 5, 2, 4, 6);

        int countedInversions = LogarithmicInversionCount.countInversions(collection).getRight();

        assertThat(countedInversions).isEqualTo(3);
    }

    @Test
    public void countInversions_shouldReturn5() {
        List<Integer> collection = com.google.common.collect.Lists.newArrayList(1, 20, 6, 4, 5);

        int countedInversions = LogarithmicInversionCount.countInversions(collection).getRight();

        assertThat(countedInversions).isEqualTo(5);
    }

    @Test
    public void countInversions_shouldReturnLargestPossibleInversion() {
        // Largest possible inversion is n(n-1) / 2
        List<Integer> collection = com.google.common.collect.Lists.newArrayList(6, 5, 4, 3, 2, 1);
        int n = collection.size();

        int countedInversions = LogarithmicInversionCount.countInversions(collection).getRight();

        int expectedInversion = n * (n - 1) / 2;
        assertThat(countedInversions).isEqualTo(expectedInversion);
    }

    @Test
    public void countInversions_shouldReturn0() {
        List<Integer> collection = com.google.common.collect.Lists.newArrayList(1, 12, 23, 34, 45, 56);

        int countedInversions = LogarithmicInversionCount.countInversions(collection).getRight();

        assertThat(countedInversions).isEqualTo(0);
    }

    @Test
    public void countInversions_shouldReturn0_whenEmpty() {
        List<Integer> collection = com.google.common.collect.Lists.newArrayList();

        int countedInversions = LogarithmicInversionCount.countInversions(collection).getRight();

        assertThat(countedInversions).isEqualTo(0);
    }

    @Test
    public void countInversions_shouldReturn0_whenSingle() {
        List<Integer> collection = com.google.common.collect.Lists.newArrayList(2341);

        int countedInversions = LogarithmicInversionCount.countInversions(collection).getRight();

        assertThat(countedInversions).isEqualTo(0);
    }

    @Test
    public void countInversions_shouldReturn0_whenNull() {
        List<Integer> collection = null;

        int countedInversions = LogarithmicInversionCount.countInversions(collection).getRight();

        assertThat(countedInversions).isEqualTo(0);
    }

    @Test
    public void countInversions_shouldHandleDuplicatesAtEnd() {
        List<Integer> collection = com.google.common.collect.Lists.newArrayList(1, 20, 6, 4, 5, 20, 20, 20);

        int countedInversions = LogarithmicInversionCount.countInversions(collection).getRight();

        assertThat(countedInversions).isEqualTo(5);
    }

    @Test
    public void countInversions_shouldHandleDuplicatesInMiddle() {
        List<Integer> collection = com.google.common.collect.Lists.newArrayList(1, 20, 6, 4, 20, 20, 20, 5);

        int countedInversions = LogarithmicInversionCount.countInversions(collection).getRight();

        assertThat(countedInversions).isEqualTo(8);
    }

}