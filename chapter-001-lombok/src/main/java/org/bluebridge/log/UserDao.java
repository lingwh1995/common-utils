package org.bluebridge.log;

import lombok.extern.java.Log;

@Log
public class UserDao {

    public void deleteById() {
        log.info("正在执行根据id删除操作....");
    }
}
