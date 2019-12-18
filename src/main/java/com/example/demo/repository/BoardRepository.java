package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by NDS_047 on 2019-12-18.
 */
public interface BoardRepository  extends JpaRepository<Board, Integer>{
}
