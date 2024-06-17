package marinalucentini.backend_w5_d1;

import marinalucentini.backend_w5_d1.entities.Menu;
import marinalucentini.backend_w5_d1.entities.Pizza;
import marinalucentini.backend_w5_d1.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BackendW5D1Application {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BackendW5D1Application.class);
		Topping cheese = context.getBean(Topping.class);
		System.out.println(cheese);
		Pizza margherita = context.getBean(Pizza.class);
		System.out.println(margherita);
		Pizza pizzaHawai = (Pizza) context.getBean("pizzaHawaiana");
		System.out.println(pizzaHawai);
		Pizza pizzaSalami = (Pizza) context.getBean("pizzaSalami");
		System.out.println(pizzaSalami);
		Pizza pizzaPazza = (Pizza) context.getBean("pizzaGenerate");
		System.out.println(pizzaPazza);

		Menu menuPizzeria = (Menu) context.getBean("Menu");
		System.out.println(menuPizzeria);
		context.close();
		SpringApplication.run(BackendW5D1Application.class, args);
	}

}
