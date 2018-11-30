package com.pchromic.boardgamemate.domain;

import com.pchromic.boardgamemate.enums.UserType;

import javax.persistence.*;
import java.util.*;

@Entity
@Table (name = "player")
public class Player extends AbstractEntity{

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "nick",nullable = false)
    private String nick;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "motto",nullable = false)
    private String motto;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "playability_id")
    private List<Playability> playabilities;

    public void addPlayability(Playability playability) {
        playabilities.add(playability);
        playability.setPlayer(this);
    }

    public void removePlayability(Playability playability) {
        playabilities.remove(playability);
        playability.setPlayer(null);
    }

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "player_boardgame",
            joinColumns = @JoinColumn(name = "player_id"),
            inverseJoinColumns = @JoinColumn(name = "boardgame_id")
    )
    private Set<BoardGame> boardGames = new HashSet<>();

    public void addBoardGame(BoardGame boardGame) {
        boardGames.add(boardGame);
        boardGame.getPlayers().add(this);
    }

    public void removeTag(BoardGame boardGame) {
        boardGames.remove(boardGame);
        boardGame.getPlayers().remove(this);
    }

    public Player() {
    }

    public Player(String name, String nick, String email, String motto, UserType userType) {
        this.name = name;
        this.nick = nick;
        this.email = email;
        this.motto = motto;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public List<Playability> getPlayabilities() {
        return playabilities;
    }

    public void setPlayabilities(List<Playability> playabilities) {
        this.playabilities = playabilities;
    }

    public Set<BoardGame> getBoardGames() {
        return boardGames;
    }

    public void setBoardGames(Set<BoardGame> boardGames) {
        this.boardGames = boardGames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) &&
                Objects.equals(nick, player.nick) &&
                Objects.equals(email, player.email) &&
                Objects.equals(motto, player.motto) &&
                userType == player.userType &&
                Objects.equals(playabilities, player.playabilities);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, nick, email, motto, userType, playabilities);
    }
}
