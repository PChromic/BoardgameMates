package com.pchromic.boardgamemate.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "match")
public class Match extends AbstractEntity{

    private List<Player> winners;

    @OneToOne
    private BoardGame boardGame;

    @ManyToMany
    @JoinTable(
            name = "player_first_team",
            joinColumns = { @JoinColumn(name = "match_id") },
            inverseJoinColumns = { @JoinColumn(name = "player_id") }
    )
    private List<Player> firstTeam;

    @ManyToMany
    @JoinTable(
            name = "player_second_team",
            joinColumns = { @JoinColumn(name = "match_id") },
            inverseJoinColumns = { @JoinColumn(name = "player_id") }
    )
    private List<Player> secondTeam;


    public Match() {
    }

    public Match(List<Player> winners, BoardGame boardGame, List<Player> firstTeam, List<Player> secondTeam) {
        this.winners = winners;
        this.boardGame = boardGame;
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }

    public List<Player> getWinners() {
        return winners;
    }

    public void setWinners(List<Player> winners) {
        this.winners = winners;
    }

    public BoardGame getBoardGame() {
        return boardGame;
    }

    public void setBoardGame(BoardGame boardGame) {
        this.boardGame = boardGame;
    }

    public List<Player> getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(List<Player> firstTeam) {
        this.firstTeam = firstTeam;
    }

    public List<Player> getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(List<Player> secondTeam) {
        this.secondTeam = secondTeam;
    }
}
