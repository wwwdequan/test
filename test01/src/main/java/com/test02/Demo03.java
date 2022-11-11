package com.test02;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangdequan
 * @date 2022-08-18
 */
public class Demo03 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);
    }
}
