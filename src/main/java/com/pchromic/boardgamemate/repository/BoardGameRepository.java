package com.pchromic.boardgamemate.repository;

import com.pchromic.boardgamemate.domain.BoardGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardGameRepository extends JpaRepository<BoardGame, Integer> {



}
