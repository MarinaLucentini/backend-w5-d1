package marinalucentini.backend_w5_d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Topping {
    private String nameTopping;
    private double price;
    private int calories;

}
