package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerStream {

    private static boolean isPrime(Integer integer) {
        for (int i = 2; i < integer; i++) {
            if (integer % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] nums = {12,4,3,5,6,34,23,234,43,45,56,786,345,563,4634,5654,463,5345,565,3452,34,345,89};
        List<Integer> lst = Arrays.asList(nums);

        System.out.println("------------------------------------------------------------------------");
        Stream<Integer> stream = lst.parallelStream();
        stream.map(Math::sqrt).forEach(System.out::println);

        System.out.println("-----------------------Prime Numbers------------------------------------");
        stream = lst.parallelStream();
        List<Integer> primes = stream.filter(IntegerStream::isPrime).collect(Collectors.toList());
        System.out.println(primes);

        System.out.println("--------------------------Sorted----------------------------------------");
        stream = lst.stream();
        stream.distinct().sorted(Integer::compareTo).forEach(System.out::println);

        System.out.println("---------------------------Sum------------------------------------------");
        stream = lst.stream();
        Optional<Integer> sum = stream.reduce((n1, n2) -> n1+n2);
        if (sum.isPresent())
            System.out.println(sum.get());


        stream = lst.parallelStream();
        long total = stream.reduce(1, (n1, n2) -> n1+n2);
        System.out.println(total);

        System.out.println("-------------------------Minimum----------------------------------------");
        stream = lst.stream();
        Optional<Integer> min = stream.min(Integer::compareTo);
        if (min.isPresent())
            System.out.println(min.get());

        System.out.println("-------------------------Maximum----------------------------------------");
        stream = lst.stream();
        Optional<Integer> max = stream.max(Integer::compareTo);
        if (max.isPresent())
            System.out.println(max.get());

        System.out.println("-------------------------Average----------------------------------------");
        stream = lst.stream();
        OptionalDouble avg = stream.mapToDouble(Double::valueOf).average();
        if (avg.isPresent())
            System.out.println(avg.getAsDouble());
    }
}
