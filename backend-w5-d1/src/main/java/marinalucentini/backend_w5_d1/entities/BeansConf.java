package marinalucentini.backend_w5_d1.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConf {
    @Bean
    @Primary
    public Topping getToppingCheese(){
        return new Topping("Cheese", 0.69, 92);
    }
    @Bean
    public Topping getToppingHam() {
        return new Topping("Ham", 0.99, 35);

    }
    @Bean
    public Topping getToppingOnion(){
        return new Topping("Onions", 0.69,22);
    }
    @Bean
    public Topping getToppingPineaple(){
        return new Topping("Pineaple", 0.79, 24);
    }
    @Bean
    public Topping getToppingSalami(){
        return new Topping("Salami", 0.99, 86);
    }
    @Bean
    public List<Topping> toppingMargherita (){
        List<Topping> toppingMargherita = new ArrayList<>();
        Topping cheese = new Topping("Cheese", 0.69, 92);
        Topping tomato = new Topping("Tomato", 0, 0);
        toppingMargherita.add(cheese);
        toppingMargherita.add(tomato);
        return toppingMargherita;
    }
    @Bean
    @Primary
    public Pizza pizzaMargherita (){
        return new Pizza("Pizza margherita", 4.99, 1104,toppingMargherita());
    }
    @Bean
    public Pizza pizzaHawaiana (){
        List<Topping> toppings = new ArrayList<>();
      toppings.addAll(toppingMargherita());
      toppings.add(getToppingPineaple());
      toppings.add(getToppingHam());
        return new Pizza("Pizza Hawaiana", pizzaMargherita().getPrice() + getToppingHam().getPrice()+ getToppingPineaple().getPrice(), pizzaMargherita().getCalories()+ getToppingHam().getCalories()+ getToppingPineaple().getCalories(), toppings );
    }
    @Bean
    public Pizza pizzaSalami(){
        List<Topping> toppings = new ArrayList<>();
        toppings.addAll(toppingMargherita());
        toppings.add(getToppingSalami());
        return new Pizza("Salami Pizza", pizzaMargherita().getPrice() + getToppingSalami().getPrice(), pizzaMargherita().getCalories() + getToppingSalami().getCalories(),  toppings );
    }
    @Bean
    public Pizza pizzaGenerate(Topping topping){
        List<Topping> toppings = new ArrayList<>();
        toppings.addAll(toppingMargherita());
        toppings.add(topping);
        return new Pizza("Pizza pazza", pizzaMargherita().getPrice() + topping.getPrice(), pizzaMargherita().getCalories() + topping.getCalories(), toppings );
    }
    @Bean
    public Drinks Lemonade (){
        return new Drinks("Lemonade", 1.29, 128, 0.33);
    }
    @Bean
     @Primary
    public Drinks Water (){
        return new Drinks("Water", 1.29, 0,0.5);
    }
    @Bean
    public Drinks Wine(){
        return new Drinks("Wine", 7.49,607,0.75 );
    }
    @Bean
    public Menu Menu (){
        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(pizzaMargherita());
        pizzaList.add(pizzaHawaiana());
        pizzaList.add(pizzaSalami());
        pizzaList.add(pizzaGenerate(getToppingOnion()));
        pizzaList.add(pizzaGenerate(getToppingCheese()));
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getToppingSalami());
        toppings.add(getToppingHam());
        toppings.add(getToppingOnion());
        toppings.add(getToppingPineaple());
        toppings.add(getToppingCheese());
        List<Drinks> drinksList = new ArrayList<>();
        drinksList.add(Lemonade());
        drinksList.add(Water());
        drinksList.add(Wine());
        return new Menu(pizzaList, toppings, drinksList );

    }

}
