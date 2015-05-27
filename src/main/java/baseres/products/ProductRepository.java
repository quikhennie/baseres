package baseres.products;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
	
	Product findByBarcode(String barcode);
	List<Product> findAll();

}
