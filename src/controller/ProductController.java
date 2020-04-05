package controller;

import model.Product;
import service.ProductService;
import service.serviceImple.ProductServiceImpl;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class ProductController extends ProductServiceImpl implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Product> products;
    public ProductController() {
        populateProducts();
    }

    private void populateProducts() {
        products = new ArrayList<>();
        products.add(new Product(1,"p1","p1 is good"));
        products.add(new Product(2,"p2","p2 is good"));
        products.add(new Product(3,"p3","p3 is good"));
    }

    @Override
    public Product getChosenProductById(int id) {
        Product product = null;
        for(Product p : products){
            if(p.getId() == id){
                product = p;
            }
        }
        return product;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
