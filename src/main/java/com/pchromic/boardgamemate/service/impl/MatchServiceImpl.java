package com.pchromic.boardgamemate.service.impl;

import com.pchromic.boardgamemate.domain.Match;
import com.pchromic.boardgamemate.exception.EntityNotFoundException;
import com.pchromic.boardgamemate.service.MatchService;

import java.util.List;

public class MatchServiceImpl implements MatchService {
    @Override
    public void add(Match entity) {

    }

    @Override
    public void delete(Match entity) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Match update(Match entity) {
        return null;
    }

    @Override
    public Match findOne(Integer id) throws EntityNotFoundException {
        return null;
    }

    @Override
    public List<Match> findAll() {
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
