package com.pchromic.boardgamemate.repository.custom;

import com.pchromic.boardgamemate.domain.BoardGame;
import com.pchromic.boardgamemate.domain.Player;
import com.pchromic.boardgamemate.enums.BoardGameType;
import com.pchromic.boardgamemate.enums.UserType;
import com.pchromic.boardgamemate.repository.BoardGameRepository;
import com.pchromic.boardgamemate.repository.PlayerRepository;
import org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlayerRepositoryCustomTest {

    @Autowired
    private PlayerRepository repository;

    @Autowired
    private BoardGameRepository boardgameRepository;


    @Test
    public void fetchPlayerGames() {
        // given
        BoardGame boardGame = boardgameRepository.save(new BoardGame("Gra o tron", BoardGameType.ECONOMIC, 180));
        Player player = repository.save(new Player("Przemek", "Szwed", "13wp@wp.pl", "YOLO", UserType.ADMIN));
        player.addBoardGame(boardGame);
        // when
        Set<BoardGame> boardGames = repository.fetchPlayerGames(1);
        // then
        assertNotNull(boardGames);
        assertEquals(1,boardGames.size());

    }

    @Test
    public void removePlayerGame() {
        // given

        // when
        Optional<Player> player = repository.findById(1);
        repository.removePlayerGame(player.get().getId(),1);
        // then
        assertEquals(player.get().getBoardGames().size(),0);
    }

    @Test
    public void addPlayerGame() {

        // when

    }
}