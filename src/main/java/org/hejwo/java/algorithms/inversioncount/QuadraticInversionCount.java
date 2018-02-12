package org.hejwo.java.algorithms.inversioncount;

import java.util.List;

import static org.apache.commons.collections4.CollectionUtils.isEmpty;

public class QuadraticInversionCount {

    public static int countInversions(List<Integer> list) {
        if (isEmpty(list) || list.size() == 1) {
            return 0;
        }
        int inversionCount = 0;

        for (int i = 0; i < list.size(); i++) {
            Integer currentElement = list.get(i);
            for (int j = i; j < list.size(); j++) {
                Integer comparedElement = list.get(j);
                if (currentElement > comparedElement) {
                    inversionCount++;
                }
            }
        }
        return inversionCount;
    }

}
