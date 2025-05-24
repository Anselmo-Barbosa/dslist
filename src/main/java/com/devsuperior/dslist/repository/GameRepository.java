package com.devsuperior.dslist.repository;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameReposity extends JpaRepository<Game,Long> {
}
