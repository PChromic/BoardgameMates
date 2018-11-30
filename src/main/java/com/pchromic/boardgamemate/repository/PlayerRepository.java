package com.pchromic.boardgamemate.repository;

import com.pchromic.boardgamemate.domain.BoardGame;
import com.pchromic.boardgamemate.domain.Player;
import com.pchromic.boardgamemate.repository.custom.PlayerRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PlayerRepository extends JpaRepository<Player, Integer>, PlayerRepositoryCustom {
}
