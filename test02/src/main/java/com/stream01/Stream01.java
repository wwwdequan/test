package com.stream01;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author wangdequan
 * @date 2022-10-18
 */
public class Stream01 {
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

        //从menu获得流
        List<String> threeHighCaloricDishNames = menu.stream()
                //建立操作流水线，选出高热量的菜
                .filter(d -> d.getCalories()> 300)
                //获取菜名
                .map(Dish::getName)
                //只选择前三个
                .limit(3)
                //将结果保存在另一个List中
                .collect(toList());
        System.out.println(threeHighCaloricDishNames);
    }


}
