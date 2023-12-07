package org.bluebridge.getterandsetter.setter;

import org.junit.jupiter.api.Test;

/**
 * 测试在属性上使用@Setter注解
 */
public class LombokSetterTest {

    /**
     * 测试lombok的@Setter注解
     */
    @Test
    public void testLombokSetter() {
        User user = new User();
        user.setId("001");
        user.setName("张三");
        user.setAge(18);
        //私有的Setter方法外部无法访问
        //user.setEmail("123@gmail.com");
    }
}
