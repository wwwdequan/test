package com.test03;

import com.stream03.Student;

import java.util.Optional;

/**
 * @author wangdequan
 * @date 2023-02-24 11:31
 */
public class test01 {
    public static void main(String[] args) {
        //为空
        Optional<String> empty = Optional.empty();
        //非空
        Optional<String> optional = Optional.of("optional");
        //允许为空也可以不为空的对象
        Optional<Object> optional01 = Optional.ofNullable(null);
        Optional<Object> optional02 = Optional.ofNullable("optional");

//        Student student = new Student();
//        student.setAge(23);
//        System.out.println(Optional.ofNullable(student).get());
        //存在true,不存在false
//        if (Optional.ofNullable(student).isPresent()){
//            System.out.println("不为空");
//        }else {
//            System.out.println("空");
//        }

        //如果非空，返回函数体
//        Optional.ofNullable(student).ifPresent(s -> System.out.println("年龄："+s.getAge()));

        //条件符合返回对象，不符合返回空对象
//        Optional<Student> student1 = Optional.ofNullable(student).filter(s -> s.getAge() > 18);
//        System.out.println(student1);

        //如果为空执行orElse方法里的value,不为空返回对象
//        Optional<Object> optName = Optional.ofNullable(student).map(s -> Optional.ofNullable(s.getName()).orElse("name为空"));
//        System.out.println(optName);

        //如果非空，返回value，如果为空，返回other
//        Student optName1 = Optional.ofNullable(student).orElse(new Student("窦汝昌", 45));

        //入参为Supplier对象，为空返回传入对象的.get()方法,如果非空则返回当前对象
//        Optional<Supplier<Student>> sup = Optional.ofNullable(Student::new);
//        Student student1 = Optional.ofNullable(student).orElseGet(sup.get());
//        System.out.println(student1);


    }
}
