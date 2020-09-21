package com.main.GroseryStore.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.GroseryStore.modeldata.Page;

public interface PagesRepo extends JpaRepository<Page, Integer> {
	 Page findBySlug(String slug);

	    // @Query("SELECT p FROM Page p WHERE p.id != :id and p.slug = :slug")
	    // Page findBySlug(int id, String slug);

	    Page findBySlugAndIdNot(String slug, int id);

	    List<Page> findAllByOrderBySortingAsc();


}
