package org.bluebridge.equalsandhashcode;


import lombok.EqualsAndHashCode;

/**
 * 在属性上使用@EqualsAndHashCode注解
 */
@EqualsAndHashCode
public class User {
    private String id;
    private String name;
    private int age;
    private String email;
}
