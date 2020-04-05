package controller;

import model.Product;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
@Named
@ViewScoped
public class ProductDetailController implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    @Inject
    private Product product;
    @Inject
    private ProductController productController;

    public void onload(){
        product = productController.getChosenProductById(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
