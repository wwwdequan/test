package com.test02;

import java.util.*;

import static java.util.stream.Collectors.toList;

/**
 * @author User
 */
public class Demo01 {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));
        //从menu获得流
//        List<String> threeHighCaloricDishNames = menu.stream()
//                //建立草走流水线，选出高热量的菜
//                .filter(d -> d.getCalories() > 300)
//                //获取菜名
//                .map(Dish::getName)
//                //只选择前三个
//                .limit(3)
//                //将结果保存在另一个List中
//                .collect(toList());
//        System.out.println(threeHighCaloricDishNames);
//
//        ArrayList<String> names = new ArrayList<>();
//        for (Dish d : menu) {
//            names.add(d.getName());
//        }
//        System.out.println("names = " + names);
//        ArrayList<String> namess = new ArrayList<>();
//        Iterator<Dish> iterator = menu.iterator();
//        while (iterator.hasNext()) {
//            Dish d = iterator.next();
//            namess.add(d.getName());
//        }
//        System.out.println("namess = " + namess);
//
//        List<Dish> vd =
//                menu.stream()
//                        .filter(Dish::isVegetarian)
//                        .collect(toList());
//        System.out.println("vd = " + vd);
//        
//        List<Dish> dishes = menu.stream()
//                .filter(x -> x.getCalories() > 300)
//                .skip(2)
//                .collect(toList());
//        System.out.println("dishes = " + dishes);
        
        List<Dish> dishes = menu.stream()
                .filter(x -> x.getType() == Dish.Type.MEAT)
                .limit(2)
                .collect(toList());
        System.out.println("dishes = " + dishes);
    }
}
