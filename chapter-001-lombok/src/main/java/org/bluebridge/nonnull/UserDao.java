package org.bluebridge.nonnull;

import lombok.NonNull;

/**
 * 在方法参数(普通方法的参数、构造方法的参数)上和字段上使用@NonNull注解
 *      可以使用在方法参数上和字段上，可以快速便捷的参数传入判断空值的情况
 */
public class UserDao {
    public void deleteUserById(@NonNull String id){

    }
}
