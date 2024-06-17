package marinalucentini.backend_w5_d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Drinks {
    private String nameDrinks;
    private double price;
    private int calories;
    private double quantity;
}
