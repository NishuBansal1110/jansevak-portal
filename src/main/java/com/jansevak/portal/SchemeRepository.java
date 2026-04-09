package com.jansevak.portal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SchemeRepository extends JpaRepository<Scheme, Integer> {
  List<Scheme> findByCategory(String category);
}