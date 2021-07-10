package org.sid.gestionstock.dao;

import org.sid.gestionstock.entities.ProductGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductGroupRepository extends JpaRepository<ProductGroup,Integer>{
}
