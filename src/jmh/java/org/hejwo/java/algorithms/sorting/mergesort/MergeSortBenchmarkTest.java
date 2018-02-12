package org.hejwo.java.algorithms.sorting.mergesort;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import com.google.common.collect.Lists;

@State(Scope.Benchmark)
public class MergeSortBenchmarkTest {

    private List<Integer> unsorted = Lists.newArrayList(32, 1, 2, 4, 3, 6, 7, 8, 5);

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 2)
    @Warmup(iterations = 5, time = 1)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Measurement(iterations = 5, time = 1)
    public void mergeSort(Blackhole bh) {
        List<Integer> sorted = MergeSort.sort(unsorted);

        bh.consume(sorted);
    }

    @Test
    public void benchmarksRunner() throws RunnerException {
        Options opt = new OptionsBuilder()
            .include(MergeSort.class.getSimpleName())
            .forks(1)
            .build();

        new Runner(opt).run();
    }

}