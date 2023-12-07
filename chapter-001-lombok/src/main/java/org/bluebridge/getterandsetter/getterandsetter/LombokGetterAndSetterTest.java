package org.bluebridge.getterandsetter.getterandsetter;

import org.junit.jupiter.api.Test;

/**
 * 测试在类上使用@Getter注解和@Setter注解
 */
public class LombokGetterAndSetterTest {

    /**
     * 测试lombok的@Getter注解和@Setter注解
     */
    @Test
    public void testLombokGetterAndGetter() {
        User user = new User();
        //测试@Setter注解
        user.setId("001");
        user.setName("张三");
        user.setAge(18);
        //私有的Setter方法外部无法访问
        //user.setEmail("123@gmail.com");
        //测试@Getter注解
        user.getId();
        user.getName();
        user.getAge();
        //私有的Getter方法外部无法访问
        //user.getEmail();

    }
}
