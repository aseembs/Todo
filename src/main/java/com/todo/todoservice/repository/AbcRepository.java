package com.todo.todoservice.repository;

import com.todo.todoservice.pojo.Abc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbcRepository extends JpaRepository<Abc, Integer> {
}
