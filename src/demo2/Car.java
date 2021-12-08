package demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car {
    private int id;
    private String model;
    private Engine engine;

    public void ignition(boolean isKeyPresent) {
        if (isKeyPresent) {
            this.engine.ignition();
        } else {
            System.out.println("NO KEY.BAY");
        }
    }
}
