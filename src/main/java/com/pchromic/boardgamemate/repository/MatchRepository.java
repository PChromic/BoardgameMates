package com.pchromic.boardgamemate.repository;

import com.pchromic.boardgamemate.domain.BoardGame;
import com.pchromic.boardgamemate.domain.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Integer> {
}
