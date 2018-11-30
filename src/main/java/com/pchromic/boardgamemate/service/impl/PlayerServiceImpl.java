package com.pchromic.boardgamemate.service.impl;

import com.pchromic.boardgamemate.domain.Player;
import com.pchromic.boardgamemate.exception.EntityNotFoundException;
import com.pchromic.boardgamemate.service.PlayerService;

import java.util.List;

public class PlayerServiceImpl implements PlayerService {
    @Override
    public void add(Player entity) {

    }

    @Override
    public void delete(Player entity) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Player update(Player entity) {
        return null;
    }

    @Override
    public Player findOne(Integer id) throws EntityNotFoundException {
        return null;
    }

    @Override
    public List<Player> findAll() {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public boolean exists(Integer id) {
        return false;
    }
}
