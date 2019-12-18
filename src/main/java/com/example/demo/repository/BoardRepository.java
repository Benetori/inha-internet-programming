package com.example.demo.repository;

import com.example.demo.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by NDS_047 on 2019-12-18.
 */
public interface BoardRepository  extends JpaRepository<Board, Integer>{
}
