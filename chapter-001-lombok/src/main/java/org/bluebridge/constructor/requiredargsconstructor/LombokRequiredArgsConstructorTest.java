package org.bluebridge.constructor.requiredargsconstructor;

import org.junit.jupiter.api.Test;

/**
 * 使用@RequiredArgsConstructor添加有参构造方法
 */
public class LombokRequiredArgsConstructorTest {

    /**
     * 测试lombok的@RequiredArgsConstructor注解
     */
    @Test
    public void testLombokRequiredArgsConstructor() {
        User user = new User("001","张三");
    }
}
