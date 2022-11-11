package com.test03;

import java.util.ArrayList;

/**
 * @author wangdequan
 * @date 2022-10-05
 */
public class Boo {
    public static void main(String[] args) {
        //定义一个集合
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("李四");
        list.add("李四");
        list.add("李四");
        list.add("李四");
        list.add("李四");

        //Stream流
        list.stream()
                .filter((name)-> name.startsWith("李四"))
                .filter((name)-> name.length() ==2)
                .forEach((name)-> System.out.println(name));

    }
}
