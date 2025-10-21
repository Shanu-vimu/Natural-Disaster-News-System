package com.newsdot.newsdot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.newsdot.newsdot.entity.news;

public interface newsrepository extends JpaRepository<news, Long>{

}
