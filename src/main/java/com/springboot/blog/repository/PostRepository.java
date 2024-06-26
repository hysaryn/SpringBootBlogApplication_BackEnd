package com.springboot.blog.repository;

import com.springboot.blog.entity.Post;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
  //Jpa interface provided all CRUD operations

  List<Post> findByCategoryId(long categoryId);
}
