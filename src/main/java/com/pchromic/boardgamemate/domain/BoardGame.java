package com.pchromic.boardgamemate.domain;

import com.pchromic.boardgamemate.enums.BoardGameType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "boardgame")
public class BoardGame extends AbstractEntity {

    @Column (name = "name", nullable = false)
    private String name;

    @Column (name = "type", nullable = false)
    private BoardGameType type;

    @Column (name = "game_time", nullable = false)
    private int gameTime;


    @ManyToMany(mappedBy = "boardGames")
    private Set<Player> players = new HashSet<>();

    public BoardGame() {
    }

    public BoardGame(String name, BoardGameType type, int gameTime) {
        this.name = name;

        this.type = type;
        this.gameTime = gameTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public BoardGameType getType() {
        return type;
    }

    public void setType(BoardGameType type) {
        this.type = type;
    }

    public int getGameTime() {
        return gameTime;
    }

    public void setGameTime(int gameTime) {
        this.gameTime = gameTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoardGame)) return false;
        BoardGame boardGame = (BoardGame) o;
        return players == boardGame.players &&
                gameTime == boardGame.gameTime &&
                Objects.equals(name, boardGame.name) &&
                type == boardGame.type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, players, type, gameTime);
    }
}
