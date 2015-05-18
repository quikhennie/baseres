package baseres.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductService {
	@Autowired
	ProductRepository repo;
	
    @RequestMapping("/product")
    public Product product(@RequestParam(value="barcode", defaultValue="") String barcode) {
        for (Product p : repo.findByBarcode(barcode)) {
        	return p;
        }
        
        return null;
    }
}