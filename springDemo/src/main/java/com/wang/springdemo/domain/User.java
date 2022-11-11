package com.wang.springdemo.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author wangdequan
 * @date ${YEAR}-${MONTH}-${DAY}
 */
@Data
public class User {
    private int id;
    private String name;
    private Date birthday;


}
