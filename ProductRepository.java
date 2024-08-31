package com.example.ecommerce.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.ecommerce.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAll();

    Object findById(Long id);

    Product save(Product product);

    void deleteById(Long id);

}
