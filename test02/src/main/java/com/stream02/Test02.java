package com.stream02;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author wangdequan
 * @date 2022-11-08 14:39
 */
public class Test02 {
    public static void main(String[] args) {
//        List<Integer> num = Arrays.asList(1,2,1,2,1,2,4,4,5,56,6,3,5,6,78,9);
//        num.stream()
//                .filter(a->a % 2  == 0)
//                .distinct()
//                .forEach(System.err::println);


        //String::length
        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        List<Integer> length = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
//        System.out.println("length = " + length);


        List<Integer> so = Arrays.asList(1,2,3,4,5,6);
        Optional<Integer> first = so.stream()
                .map(x->x *x)
                .filter(x->x %3 == 0)
                .findFirst();
        System.out.println("first = " + first);
    }
}
