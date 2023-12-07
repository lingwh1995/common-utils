package org.bluebridge.constructor.requiredargsconstructor;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 使用@RequiredArgsConstructor添加有参构造方法
 *      只针对被final修饰或者@NonNull修饰的属性生成构造函数
 */
@RequiredArgsConstructor
public class User {
    private final String id;
    @NonNull private String name;
    private int age;
    private String email;
}
