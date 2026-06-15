package com.example.crudpractice.domain.repository;

import com.example.crudpractice.domain.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
