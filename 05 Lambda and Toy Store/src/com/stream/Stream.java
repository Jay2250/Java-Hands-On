package com.stream;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
        int[] num = {12, 4, 7, 10, 23, 546, 456, 564, 45, 3, 4, 6, 4, 34, 543, 345, 434, 34, 34, 34};
        IntStream stream = Arrays.stream(num);

        OptionalInt min = stream.min();
        if (min.isPresent())
            System.out.println(min.getAsInt());

        stream = Arrays.stream(num);
        OptionalInt max = stream.max();
        if (max.isPresent())
            System.out.println(max.getAsInt());

        stream = Arrays.stream(num);
        OptionalDouble avg = stream.average();
        if (avg.isPresent())
            System.out.println(avg.getAsDouble());

        stream = Arrays.stream(num);
        OptionalInt total = stream.reduce((n1, n2) -> n1*n2);
        if (total.isPresent())
            System.out.println(total.getAsInt());

        stream = Arrays.stream(num);
        long totalval = stream.reduce(1, (n1, n2) -> n1*n2);
        System.out.println(totalval);
    }
}
