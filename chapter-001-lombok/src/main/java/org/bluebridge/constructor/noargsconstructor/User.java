package org.bluebridge.constructor.noargsconstructor;

import lombok.NoArgsConstructor;

/**
 * 使用@NoArgsConstructor为类添加无参构造方法
 */
@NoArgsConstructor
public class User {
    private String id;
    private String name;
    private int age;
    private String email;
}
