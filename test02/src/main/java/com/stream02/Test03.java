package com.stream02;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author wangdequan
 * @date 2022-11-08 16:20
 */
public class Test03 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Goodbye", "World");
        List<String> word = words.stream()
                .map(i->i.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("word = " + word);
    }
}
