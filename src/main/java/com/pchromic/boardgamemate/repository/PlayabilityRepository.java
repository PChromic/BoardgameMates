package com.pchromic.boardgamemate.repository;

import com.pchromic.boardgamemate.domain.BoardGame;
import com.pchromic.boardgamemate.domain.Playability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayabilityRepository extends JpaRepository<Playability, Integer> {
}
