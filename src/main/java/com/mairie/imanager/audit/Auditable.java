package com.mairie.imanager.audit;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.Instant;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable<U> {

    @CreatedDate
    @Column(nullable = false,updatable = false)
    private Instant createAt;
    @CreatedBy
    @Column(nullable = false,updatable = false)
    private U createBy;
    @LastModifiedDate
    private Instant deleteAt;
    @LastModifiedBy
    private U deleteBy;

    public Auditable() {}

    public Auditable(Instant createAt, U createBy, Instant deleteAt, U deleteBy) {
        this.createAt = createAt;
        this.createBy = createBy;
        this.deleteAt = deleteAt;
        this.deleteBy = deleteBy;
    }

    public Instant getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public U getCreateBy() {
        return createBy;
    }

    public void setCreateBy(U createBy) {
        this.createBy = createBy;
    }

    public Instant getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(Instant deleteAt) {
        this.deleteAt = deleteAt;
    }

    public U getDeleteBy() {
        return deleteBy;
    }

    public void setDeleteBy(U deleteBy) {
        this.deleteBy = deleteBy;
    }

    @Override
    public String toString() {
        return "Auditable{" +
                "createAt=" + createAt +
                ", createBy=" + createBy +
                ", deleteAt=" + deleteAt +
                ", deleteBy=" + deleteBy +
                '}';
    }
}
