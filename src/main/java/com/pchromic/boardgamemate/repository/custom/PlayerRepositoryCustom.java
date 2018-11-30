package com.pchromic.boardgamemate.repository.custom;

import com.pchromic.boardgamemate.domain.BoardGame;
import org.springframework.stereotype.Repository;

import java.util.Set;


public interface PlayerRepositoryCustom {

    Set<BoardGame> fetchPlayerGames(int playerId);

    void removePlayerGame(int playerId, int boardgameId);

    void addPlayerGame(int boardgameId);


}
