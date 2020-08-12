package in.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.model.Product;
import in.nit.repo.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Product(10, "PEN", 45.50));
		repo.save(new Product(11, "CAR", 55.70));
	}

}
