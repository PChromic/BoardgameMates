package com.pchromic.boardgamemate.repository;

import com.pchromic.boardgamemate.domain.BoardGame;
import com.pchromic.boardgamemate.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
