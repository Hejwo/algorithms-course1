package org.hejwo.scala.algorithms.sorting.atest.own.inheritance.java;

public class DicuntedCustomer extends Customer {

    public DicuntedCustomer(String name, String address) {
        super(name, address);
    }

    @Override
    public Double total() {
        return super.total() * 0.90;
    }
}
