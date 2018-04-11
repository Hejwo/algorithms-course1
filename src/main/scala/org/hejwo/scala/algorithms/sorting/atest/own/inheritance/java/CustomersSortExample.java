package org.hejwo.scala.algorithms.sorting.atest.own.inheritance.java;

import java.util.Arrays;
import java.util.Iterator;

public class CustomersSortExample {

    public static void main(String[] args) {
        Customer c1 = new Customer("aaa", "");
        Customer c2 = new Customer("zzz", "");
        Customer c3 = new Customer("bbb", "");
        Customer c4 = new Customer("ccc", "");

        CustomersList customers = new CustomersList(c1, c2, c3, c4);

        System.out.println(customers.sort());
    }

    private static class CustomersList implements Sortable<Customer> {

        private final Customer[] customers;

        private CustomersList(Customer... customers) {
            this.customers = customers;
        }

        @Override
        public Iterator<Customer> iterator() {
            return Arrays.asList(customers).iterator();
        }
    }

}
