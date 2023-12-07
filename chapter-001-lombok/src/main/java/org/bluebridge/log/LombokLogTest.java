package org.bluebridge.log;

import org.junit.jupiter.api.Test;

public class LombokLogTest {
    @Test
    public void testLombokLog() {
        UserDao userDao = new UserDao();
        userDao.deleteById();
    }
}
