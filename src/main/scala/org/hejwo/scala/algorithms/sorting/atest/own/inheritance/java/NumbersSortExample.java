package org.hejwo.scala.algorithms.sorting.atest.own.inheritance.java;

import java.util.Arrays;
import java.util.Iterator;

public class NumbersSortExample {

    public static void main(String[] args) {
        Sortable<Integer> numbers = new NumberList(1, 2, 4, 10, 7, 8, 6, 9, 5, 3);
        System.out.println(numbers.sort());
    }

    private static class NumberList implements Sortable<Integer> {

        private final Integer[] number;

        private NumberList(Integer... number) {
            this.number = number;
        }

        @Override
        public Iterator<Integer> iterator() {
            return Arrays.asList(number).iterator();
        }
    }

}
