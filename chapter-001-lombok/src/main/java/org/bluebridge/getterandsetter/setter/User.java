package org.bluebridge.getterandsetter.setter;


import lombok.AccessLevel;
import lombok.Setter;

/**
 * 在属性上使用@Setter注解
 */
public class User {
    @Setter
    private String id;
    @Setter
    private String name;
    @Setter
    private int age;
    //设置生成的Setter()方法的访问权限为private,外部无法调用
    @Setter(AccessLevel.PRIVATE)
    private String email;
}
