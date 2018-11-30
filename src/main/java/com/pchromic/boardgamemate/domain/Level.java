package com.pchromic.boardgamemate.domain;


import com.pchromic.boardgamemate.enums.LevelType;

import javax.persistence.*;

@Entity
@Table (name = "level")
public class Level extends AbstractEntity{

    @Column(name = "level_type", nullable = false)
    private LevelType levelType;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Player player;

    public Level() {
    }

    public Level(LevelType levelType, Player player) {
        this.levelType = levelType;
        this.player = player;
    }

    public Level(LevelType levelType) {
        this.levelType = levelType;
    }

    public LevelType getLevelType() {
        return levelType;
    }

    public void setLevelType(LevelType levelType) {
        this.levelType = levelType;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }



}
