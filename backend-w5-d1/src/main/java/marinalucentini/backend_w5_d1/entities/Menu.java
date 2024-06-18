package marinalucentini.backend_w5_d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Menu {
    private List<Pizza> pizzaList;
    private List<Topping> toppings;
    private List<Drinks> drinks;
}
