package baseres.products.brand;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandService {
	
	@Autowired
	BrandRepository repo;
	
	@RequestMapping(value="/brand/{id}", method=RequestMethod.GET)
	public Brand getById(@PathVariable long id) {
		return repo.findById(id);
	}
	
	@RequestMapping(value="/brand", method=RequestMethod.POST)
	@ResponseBody
	public Brand newBrand(@RequestBody @Valid Brand brand) {
		return repo.save(brand);
	}
	
	@RequestMapping(value="/brands", method=RequestMethod.GET)
	public List<Brand> getAllBrands() {
		return repo.findAll();
	}

}
