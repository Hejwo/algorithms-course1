package org.hejwo.scala.algorithms.sorting.atest.own.inheritance.java;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public class Customer implements Comparable<Customer> {

    private final String name;
    private final String address;
    private final List<Pair<String, Double>> basket = Lists.newArrayList();

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void add(String item, Double price) {
        basket.add(Pair.of(item, price));
    }

    public Double total() {
        return basket.stream().mapToDouble(Pair::getRight).sum();
    }

    @Override
    public int compareTo(Customer o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}
