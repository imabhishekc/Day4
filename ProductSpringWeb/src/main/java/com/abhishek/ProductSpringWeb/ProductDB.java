package com.abhishek.ProductSpringWeb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {
    Optional<Product> findByName(String name);
    @Query("select p from Product p where lower(p.name) like %:text% OR lower(p.type) like %:text% OR lower(p.place) like %:text%")
    List<Product> searchByText(String text);
    List<Product> searchByPlace(String text);
    List<Product> findByWarranty(int warranty);
}
