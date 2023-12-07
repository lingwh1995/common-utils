package org.bluebridge.builder;

import org.junit.jupiter.api.Test;

/**
 * 使用@Builder为类添加建造者模式(链式编程)
 */
public class LombokBuilderTest {

    /**
     * 测试lombok的@Builder注解
     */
    @Test
    public void testLombokBuilder() {
        User.UserBuilder userBuilder = User.builder().id("001").name("张三").age(18).email("123@gmail.com");
        System.out.println(userBuilder);
    }
}
