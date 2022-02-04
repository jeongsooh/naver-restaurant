package com.example.restaurant.db;

import java.util.List;
import java.util.Optional;

public interface MemoryDbRepositoryIfs<T> {
  Optional<T> findById(Integer index);
  T save(T entity);
  void deleteById(Integer index);
  List<T> findAll();
}
