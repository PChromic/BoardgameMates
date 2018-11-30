package com.pchromic.boardgamemate.repository;

import com.pchromic.boardgamemate.domain.BoardGame;
import com.pchromic.boardgamemate.domain.Level;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LevelRepository extends JpaRepository<Level, Integer> {
}
