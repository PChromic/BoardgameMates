package com.pchromic.boardgamemate.domain.listener;

import com.pchromic.boardgamemate.domain.AbstractEntity;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

public class Listener {

    @PrePersist
    public void setCreateDate(AbstractEntity entity) {
        entity.setCreateDate(new Date());
        entity.setUpdateDate(new Date());
    }

    @PreUpdate
    public void setLastUpdate(AbstractEntity entity) {
        entity.setUpdateDate(new Date());
    }

}