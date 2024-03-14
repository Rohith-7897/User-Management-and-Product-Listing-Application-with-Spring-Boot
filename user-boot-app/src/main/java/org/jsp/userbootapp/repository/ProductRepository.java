package org.jsp.userbootapp.repository;

import java.util.List;

import org.jsp.userbootapp.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	List<Product> findByBrand(String brand);
	
	List<Product> findByName(String name);
	
	List<Product> findByCategory(String category);
	
	@Query("select p from Product p where p.user.id=?1")
	List<Product> findByUserid(int user_id);
	
}
