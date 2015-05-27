package baseres.products.brand;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BrandRepository extends CrudRepository<Brand, Long>{

	Brand findById(long id);
	List<Brand> findAll();
}
