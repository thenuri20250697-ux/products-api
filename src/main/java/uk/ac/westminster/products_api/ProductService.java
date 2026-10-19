package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    List<Product> products = new ArrayList<>();
    private Long nextId =1L;

    public List<Product> getAllProducts(){ //passing the ArrayList bcs we need it to return the products in the arraylist to us.
        return products;
    }

    public Product addProduct(Product product) {
        product.setId(nextId++); // use the value, then add one
        products.add(product);
        return product;

    }

        public Optional<Product> getProductById(long id) {
            return products.stream()
                    .filter(p -> p.getId()==id)
                    .findFirst();
        }

    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId()==(id));
    }

    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }



}
