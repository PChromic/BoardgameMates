package com.pchromic.boardgamemate.domain;

import com.pchromic.boardgamemate.enums.UserType;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table (name = "player")
public class Player extends AbstractEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "nick")
    private String nick;

    @Column(name = "email")
    private String email;

    @Column(name = "motto")
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
