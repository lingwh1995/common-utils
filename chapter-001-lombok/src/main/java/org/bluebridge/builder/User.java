package org.bluebridge.builder;

import lombok.Builder;
import lombok.Data;

/**
 * 使用@Builder为类添加建造者模式(链式编程)
 */
@Builder
@Data
public class User {
    private String id;
    private String name;
    private int age;
    private String email;
}
