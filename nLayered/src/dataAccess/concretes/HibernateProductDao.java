package dataAccess.concretes;

import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements ProductDao {
    @Override
    public Product add(Product product) {
        System.out.println("Hibernate ile eklendi = "+ product.getName());
        return product;
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }
    @Override
    public Product get(int id){
        return null;
    }
    @Override
    public List<Product> getAll(){
        return null;
    }
}
