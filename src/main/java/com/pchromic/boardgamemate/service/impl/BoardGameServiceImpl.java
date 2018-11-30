package com.pchromic.boardgamemate.service.impl;

import com.pchromic.boardgamemate.domain.BoardGame;
import com.pchromic.boardgamemate.exception.EntityNotFoundException;
import com.pchromic.boardgamemate.service.BoardGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardGameServiceImpl implements BoardGameService {

    @Override
    public void add(BoardGame entity) {

    }

    @Override
    public void delete(BoardGame entity) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public BoardGame update(BoardGame entity) {
        return null;
    }

    @Override
    public BoardGame findOne(Integer id) throws EntityNotFoundException {
        return null;
    }

    @Override
    public List<BoardGame> findAll() {
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
