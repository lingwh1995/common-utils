package org.bluebridge.tostring;

import org.junit.jupiter.api.Test;

/**
 * 在属性上使用@ToString注解
 */
public class LombokToStringTest {

    /**
     * 测试lombok的@toString注解
     */
    @Test
    public void testLombokGetter() {
        User user = new User();
        System.out.println(user.toString());
    }
}
