package com.example.mysql.doubleEntity.demoDoubleEntity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.mysql.doubleEntity.demoDoubleEntity.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}