package com.pchromic.boardgamemate.domain;

import com.pchromic.boardgamemate.domain.listener.Listener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners(Listener.class)
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @Version
    @Column(name = "version", columnDefinition = "int default 0")
    private int version;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_TIME")
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED_TIME")
    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public int getVersion() {
        return version;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}