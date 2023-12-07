package org.bluebridge.getterandsetter.getter;

import org.junit.jupiter.api.Test;

/**
 * 测试在属性上使用GSetter注解
 */
public class LombokGetterTest {

    /**
     * 测试lombok的@Getter注解
     */
    @Test
    public void testLombokGetter() {
        User user = new User();
        user.getId();
        user.getName();
        user.getAge();
        //私有的Getter方法外部无法访问
        //user.getEmail();
    }
}
