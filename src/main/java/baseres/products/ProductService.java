package baseres.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductService {
	@Autowired
	ProductRepository repo;
    
    @RequestMapping("/products")
    public List<Product> products() {
    	return repo.findAll();
    }
    
    @RequestMapping(value="/product/{barcode}", method=RequestMethod.GET)
    public Product getProduct(@PathVariable String barcode) {
    	Product product = (Product) repo.findByBarcode(barcode);
		return product;
    }
    
    @RequestMapping(value="/product", method=RequestMethod.POST)
    @ResponseBody
    public Product createProduct(@RequestBody Product product) {
		return repo.save(product);
    }
    
    
    @RequestMapping(value="/product/{barcode}", method=RequestMethod.DELETE)
    public void deleteProduct(@PathVariable String barcode) {
    	Product product = (Product) repo.findByBarcode(barcode);
		repo.delete(product);
    }
    
    @RequestMapping(value="/product", method=RequestMethod.PUT)
    @ResponseBody
    public void updateProduct(@RequestBody Product product) {
		repo.save(product);
    }
    
    
}