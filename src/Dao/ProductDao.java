package Dao;

import Model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getAll();

    Product getById(long id);

    Product create(String name, int price, String comments);

    void update(Product product);

    boolean delete(long id);
}

