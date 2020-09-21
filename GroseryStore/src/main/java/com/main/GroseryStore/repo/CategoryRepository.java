package com.main.GroseryStore.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.GroseryStore.modeldata.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	  Category findByName(String name);

	    List<Category> findAllByOrderBySortingAsc();

	    Category findBySlug(String slug);

}
