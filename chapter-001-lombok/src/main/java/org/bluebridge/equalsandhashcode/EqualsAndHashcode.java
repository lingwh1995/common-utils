package org.bluebridge.equalsandhashcode;

import org.junit.jupiter.api.Test;

/**
 * 在属性上使用@EqualsAndHashCode注解
 */
public class EqualsAndHashcode {

    @Test
    public void testLombokEqualsAndHashcode() {
        User user = new User();
        System.out.println(user.hashCode());
    }
}
