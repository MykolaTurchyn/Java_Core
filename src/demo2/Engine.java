package demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Engine {
    private int power;
    private int volume;

    public void ignition(){
        System.out.println("ignition start");
    }
}
