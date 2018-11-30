package com.pchromic.boardgamemate.repository.custom.impl;

import com.pchromic.boardgamemate.domain.BoardGame;
import com.pchromic.boardgamemate.repository.custom.PlayerRepositoryCustom;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class PlayerRepositoryCustomImpl implements PlayerRepositoryCustom {
    @Override
    public Set<BoardGame> fetchPlayerGames(int playerId) {
        return null;
    }

    @Override
    public void removePlayerGame(int playerId, int boardgameId) {

    }

    @Override
    public void addPlayerGame(int boardgameId) {

    }
}
