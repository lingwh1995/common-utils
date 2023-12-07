package org.bluebridge.nonnull;

import org.junit.jupiter.api.Test;

public class LombokNonNullTest {

    @Test
    public void testLombokNonNull() {
        UserDao userDao = new UserDao();
        userDao.deleteUserById(null);
    }
}
