package org.bluebridge.constructor.allargsconstructor;

import lombok.AllArgsConstructor;

/**
 * 使用@AllArgsConstructor添加包含所有属性的有参构造方法
 */
@AllArgsConstructor
public class User {
    private String id;
    private String name;
    private int age;
    private String email;
}
