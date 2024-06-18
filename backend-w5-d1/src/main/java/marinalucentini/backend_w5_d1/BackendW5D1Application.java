package marinalucentini.backend_w5_d1;

import marinalucentini.backend_w5_d1.entities.Menu;
import marinalucentini.backend_w5_d1.entities.Pizza;
import marinalucentini.backend_w5_d1.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Collectors;

@SpringBootApplication
public class BackendW5D1Application {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BackendW5D1Application.class);

		Menu menuPizzeria = context.getBean(Menu.class);
		System.out.println("Menu pizzeria");
		System.out.println("Pizzas");

		menuPizzeria.getPizzaList().forEach(el->{
			String pizzeIngredients =  el.getToppings().stream().map(Topping::getNameTopping).collect(Collectors.joining(","));
			System.out.println("Nome:" +el.getNamePizza()+
					" prezzo: " + el.getPrice()+
					" calorie: " + el.getCalories()+
					" ingredienti: " + "(" + pizzeIngredients + ")");;
		});
		System.out.println("Toppins");
		menuPizzeria.getToppings().forEach(el->
				System.out.println( el.getNameTopping() + " calorie "+ el.getCalories()+ " prezzo " + el.getPrice()));
		System.out.println("Drinks");
		menuPizzeria.getDrinks().forEach(el-> System.out.println(
				 el.getNameDrinks() + "(" + el.getQuantity() + "L)" + " prezzo " + el.getPrice() + " calorie " + el.getCalories()
		));
		context.close();
		SpringApplication.run(BackendW5D1Application.class, args);
	}

}
