package com.test03;

/**
 * @author wangdequan
 * @date 2023-02-20 18:03
 */
public class DemoApplication {
    public static void main(String[] args) {

        //父类类型 对象 = new 子类类型（）
        Animal dog = (Animal) new Dog();
        Dog dog1 = (Dog) dog;
        System.out.println(dog.age);

    }
}
