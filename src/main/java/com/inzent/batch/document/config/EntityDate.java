package com.inzent.batch.document.config;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Date;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
public abstract class EntityDate {

    @CreationTimestamp
    @Setter
    @Column(name = "REGDATE")
    private Date regDate;

    @Column(name = "CREATE_USR")
    @Setter
    private String createUser;

    @UpdateTimestamp
    @Setter
    @Column(name = "UPDATE_AT")
    private Date updateAt;

    @Column(name = "UPDATE_USR")
    @Setter
    private String updateUser;

}
