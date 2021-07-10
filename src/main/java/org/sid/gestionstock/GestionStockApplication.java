package org.sid.gestionstock;

import org.sid.gestionstock.dao.ProductGroupRepository;
import org.sid.gestionstock.dao.ProductRepository;
import org.sid.gestionstock.entities.Product;
import org.sid.gestionstock.entities.ProductGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

@SpringBootApplication
public class GestionStockApplication implements CommandLineRunner {
    @Autowired
    private ProductGroupRepository productGroupRepository;
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(GestionStockApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("group1","group2","group3").forEach(groupe->{
            ProductGroup productGroup=new ProductGroup();
            productGroup.setGroupName(groupe);
            productGroupRepository.save(productGroup);
        });

        productGroupRepository.findAll().forEach(groupe->{
            Stream.of("produit1","produit2","produit3").forEach(name->{
                Product product=new Product();
                product.setProductName(name);
                product.setQuantity(3);
                product.setProductGroup(groupe);
                productRepository.save(product);
            });
        });

    }
}
