package com.test03;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author wangdequan
 * @date 2023-04-03 11:38
 */
public class Test02 {
    public static void main(String[] args) {
        /**
         * 3 个张三，2 个李强
         */
        List<String> initList = Arrays.asList(
                "张三",
                "李四",
                "张三",
                "周一",
                "刘四",
                "李强",
                "李白",
                "张三",
                "李强",
                "王五"
        );

        //set去重
        List<String> list = new ArrayList(initList);
//        List<String> list2 = new ArrayList(new LinkedHashSet(list));
//        System.out.println("list2 = " + list2);


        list  =  list.stream().distinct().collect(Collectors.toList());
        System.out.println("list = " + list);
    }
}
