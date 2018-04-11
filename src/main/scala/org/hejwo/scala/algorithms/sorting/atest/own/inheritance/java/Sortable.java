package org.hejwo.scala.algorithms.sorting.atest.own.inheritance.java;

import com.google.common.collect.Lists;

import java.util.List;

public interface Sortable<A extends Comparable<A>> extends Iterable<A> {

    default List<A> sort() {
        List<A> list = Lists.newArrayList();
        for (A elemnt : this) list.add(elemnt);
        list.sort(Comparable::compareTo);
        return list;
    }

}
