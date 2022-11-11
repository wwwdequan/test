package com.stream02;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author wangdequan
 * @date 2022-11-08 16:44
 */
public class Demo01 {
    public static void main(String[] args) {
        //返回平方列表
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> sq = numbers.stream()
//                .map(n->n*n)
//                .collect(toList());
//        System.out.println("sq = " + sq);

        //返回列表对
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
//        List<int[]> ps = numbers1.stream()
//                        .flatMap(i -> numbers2.stream()
//                                .map(j -> new int[]{i, j})
//                        )
//                        .collect(toList());
//        System.out.println("ps = " + ps);

        //返回总和能被3整除的数对
        List<int[]> ps2 = numbers1.stream()
                .flatMap(i -> numbers2.stream()
                        .filter(j -> (i + j) % 3 == 0)
                        .map(j -> new int[]{i, j})
                )
                .collect(toList());
        for (int[] ints : ps2) {
            System.out.println("ints = " + Arrays.toString(ints));
        }
    }
}
