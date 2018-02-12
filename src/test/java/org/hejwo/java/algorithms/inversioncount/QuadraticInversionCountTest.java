package org.hejwo.java.algorithms.inversioncount;

import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

import static org.assertj.core.api.Assertions.assertThat;

public class QuadraticInversionCountTest {

    @Test
    public void countInversions_shouldReturn3() {
        List<Integer> collection = Lists.newArrayList(1, 3, 5, 2, 4, 6);

        int countedInversions = QuadraticInversionCount.countInversions(collection);

        assertThat(countedInversions).isEqualTo(3);
    }

    @Test
    public void countInversions_shouldReturn5() {
        List<Integer> collection = Lists.newArrayList(1, 20, 6, 4, 5);

        int countedInversions = QuadraticInversionCount.countInversions(collection);

        assertThat(countedInversions).isEqualTo(5);
    }

    @Test
    public void countInversions_shouldReturnLargestPossibleInversion() {
        // Largest possible inversion is n(n-1) / 2
        List<Integer> collection = Lists.newArrayList(6, 5, 4, 3, 2, 1);
        int n = collection.size();

        int countedInversions = QuadraticInversionCount.countInversions(collection);

        int expectedInversion = n * (n - 1) / 2;
        assertThat(countedInversions).isEqualTo(expectedInversion);
    }

    @Test
    public void countInversions_shouldReturn0() {
        List<Integer> collection = Lists.newArrayList(1, 12, 23, 34, 45, 56);

        int countedInversions = QuadraticInversionCount.countInversions(collection);

        assertThat(countedInversions).isEqualTo(0);
    }

    @Test
    public void countInversions_shouldReturn0_whenEmpty() {
        List<Integer> collection = Lists.newArrayList();

        int countedInversions = QuadraticInversionCount.countInversions(collection);

        assertThat(countedInversions).isEqualTo(0);
    }

    @Test
    public void countInversions_shouldReturn0_whenSingle() {
        List<Integer> collection = Lists.newArrayList(2341);

        int countedInversions = QuadraticInversionCount.countInversions(collection);

        assertThat(countedInversions).isEqualTo(0);
    }

    @Test
    public void countInversions_shouldReturn0_whenNull() {
        List<Integer> collection = null;

        int countedInversions = QuadraticInversionCount.countInversions(collection);

        assertThat(countedInversions).isEqualTo(0);
    }

    @Test
    public void countInversions_shouldHandleDuplicatesAtEnd() {
        List<Integer> collection = Lists.newArrayList(1, 20, 6, 4, 5, 20, 20, 20);

        int countedInversions = QuadraticInversionCount.countInversions(collection);

        assertThat(countedInversions).isEqualTo(5);
    }

    @Test
    public void countInversions_shouldHandleDuplicatesInMiddle() {
        List<Integer> collection = Lists.newArrayList(1, 20, 6, 4, 20, 20, 20, 5);

        int countedInversions = QuadraticInversionCount.countInversions(collection);

        assertThat(countedInversions).isEqualTo(8);
    }
}