package com.test03;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author wangdequan
 * @date 2022-10-05
 */
public class Boo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        //map()是对集合中的对象进行映射的，将对象从一种类型转换成另一种类型
        list.stream().map(num -> Integer.parseInt(num));
        list.stream().forEach((name) -> System.out.println("name = " + name));
        list.stream().limit(2);
    }
}
