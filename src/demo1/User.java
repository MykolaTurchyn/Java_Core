package demo1;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class User {
    private int id;
    private String name;
    private Skill skill;
}

