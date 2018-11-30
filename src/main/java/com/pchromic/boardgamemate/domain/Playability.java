package com.pchromic.boardgamemate.domain;

import com.pchromic.boardgamemate.enums.Day;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "playability")
public class Playability extends AbstractEntity{

    @Enumerated(EnumType.STRING)
    private Day day;

    @Column(name = "start_hour")
    private int startHour;

    @Column(name = "start_minute")
    private int startMinute;

    @Column(name = "end_hour")
    private int endHour;

    @Column(name = "end_minute")
    private int endMinute;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id")
    private Player player;


    public Playability() {
    }

    public Playability(Day day, int startHour, int startMinute, int endHour, int endMinute) {
        this.day = day;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.endHour = endHour;
        this.endMinute = endMinute;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    public int getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(int endMinute) {
        this.endMinute = endMinute;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Playability)) return false;
        Playability that = (Playability) o;
        return startHour == that.startHour &&
                startMinute == that.startMinute &&
                endHour == that.endHour &&
                endMinute == that.endMinute &&
                day == that.day &&
                Objects.equals(player, that.player);
    }

    @Override
    public int hashCode() {

        return Objects.hash(day, startHour, startMinute, endHour, endMinute, player);
    }
}
