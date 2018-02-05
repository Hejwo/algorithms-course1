package org.hejwo.java.algorithms.sorting.mergesort;

public class HardTest {

    public static void hardTestTop() {
        hardTestSub1();
        hardTestSub2();
    }

    private static void hardTestSub1() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void hardTestSub2() {
        try {
            Thread.sleep(950);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
