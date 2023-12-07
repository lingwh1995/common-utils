package org.bluebridge.getterandsetter.getterandsetter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * 在类上使用@Getter注解和@Setter注解
 *      被final或者static修饰的属性，lombok无法为其生成指定的Getter()方法和Setter()方法
 */
@Getter
@Setter
public class User {
    private String id;
    private String name;
    private int age;
    //设置部位email这个属性生成的Getter()方法和Setter()方法
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private String email;
}
