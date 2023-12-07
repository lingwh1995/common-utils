package org.bluebridge.data;

import lombok.Data;

/**
 * 使用@Data = @Getter + @Setter + @ToString + @EqualsAndHashCode + @RequiredArgsConstructor
 */
@Data
public class User {
    private String id;
    private String name;
    private int age;
    private String email;
}
