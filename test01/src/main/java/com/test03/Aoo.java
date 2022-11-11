package com.test03;

import java.util.ArrayList;

/**
 * @author wangdequan
 * @date 2022-10-05
 */
public class Aoo {
    public static void main(String[] args) {
        //定义一个集合
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("张四");
        list.add("四");
        list.add("张四");
        list.add("张四");
        list.add("张四");
        list.add("张四");

        //筛选list中包含张三的
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张三")) {
                list1.add(s);
            }
        }
        System.out.println("挑选list包含张三的结果："+list1);
        // 3.再从list1中挑选挑选名字长度为2的

        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if (s.length() == 2) {
                list2.add(s);
            }
        }
        System.out.println("挑选list1长度为2的结果："+list2);

        //遍历
        for (String s : list2) {
            System.out.println("最终结果="+s);
        }
    }
}
