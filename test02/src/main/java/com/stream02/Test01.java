package com.stream02;

import com.stream01.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

/**
 * @author wangdequan
 * @date 2022-11-08 14:34
 */
public class Test01 {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );


//        List<Dish> ve = menu.stream()
//                .filter(Dish::isVegetarian)
//                .collect(toList());

        //limit(n)
//        List<Dish> dis = menu.stream()
//                .filter(i -> i.getCalories() > 300)
//                .limit(3)
//                .collect(toList());
//        System.out.println("dis = " + dis);

        //skip(n)
//        List<Dish> dis = menu.stream()
//                .filter(i -> i.getCalories() > 300)
//                .skip(2)
//                .collect(toList());
//        System.out.println("dis = " + dis);

        //前两个荤菜
//        List<Dish> dis = menu.stream()
//                .filter(i -> i.getType() == Dish.Type.MEAT)
//                .limit(2)
//                .collect(toList());
//        System.out.println("dis = " + dis);

        //菜名的长度
//        List<Integer> disLength = menu.stream()
//                .map(Dish::getName)
//                .map(String::length)
//                .collect(toList());
//        System.out.println("disLength = " + disLength);

//        菜单里面是否有素食可选择
//        if (menu.stream().anyMatch(Dish::isVegetarian)){
//            System.out.println("有多种素食可供选择！！！");
//        }
        //是否都能匹配给定的谓词
//        boolean isHealthy = menu.stream()
//                .allMatch(i->i.getCalories()<100);
//        System.out.println("isHealthy = " + isHealthy);

        //是否没有任何能匹配的
//        boolean ish = menu.stream().noneMatch(i->i.getCalories()>=100);
//        System.out.println("ish = " + ish);

        //查询一道素食
//        Optional<Dish> dish = menu.stream()
//                .filter(Dish::isVegetarian)
//                .findAny();
//        System.out.println("dish = " + dish);

        //如果包含一个值就打印它，否则什么都不做
        menu.stream()
                .filter(Dish::isVegetarian)
                .findAny()
                .ifPresent(i-> System.out.println(i.getName()));
    }
}
