package demo1;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Developer {
    private int dev_id;
    private String name;
    private Skill skill;

    public Developer(int dev_id, String name, String type_of_skill, double exp) {
        this.dev_id = dev_id;
        this.name = name;
        this.skill = new Skill(type_of_skill,exp);
    }
}
