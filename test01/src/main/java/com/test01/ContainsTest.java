package com.test01;

import com.test01.domain.User;

public class ContainsTest {
    public static void main(String[] args) {
        String str1 = "hello,world!",str2 = "what?";
        CharSequence a = "llo";
        boolean b = str1.contains(a);
        System.out.println("第一条返回结果是："+b);

        b = str2.contains("!");
        System.out.println("第二条返回结果是："+b);

    }
}
