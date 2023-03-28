package com.codeup.codeupspring.blog.repositories;

import com.codeup.codeupspring.blog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {

}
