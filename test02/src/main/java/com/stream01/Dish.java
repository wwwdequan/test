package com.stream01;

public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;
    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }
    /**名称*/
    public String getName() {
        return name;
    }
    /**素食*/
    public boolean isVegetarian() {
        return vegetarian;
    }
    /**卡*/
    public int getCalories() {
        return calories;
    }
    /**名称*/
    public Type getType() {
        return type;
    }
    @Override
    public String toString() {
        return name;
    }

    /**
     * 肉类，鱼类，其他
     */
    public enum Type { MEAT, FISH, OTHER }
}