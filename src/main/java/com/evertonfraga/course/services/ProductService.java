package com.evertonfraga.course.services;

import com.evertonfraga.course.entities.Category;
import com.evertonfraga.course.entities.Product;
import com.evertonfraga.course.repositories.CategoryRepository;
import com.evertonfraga.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
