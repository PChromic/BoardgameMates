package com.pchromic.boardgamemate.domain;

import com.pchromic.boardgamemate.repository.BoardGameRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "boardgame")
public class BoardGame extends AbstractEntity {

}
