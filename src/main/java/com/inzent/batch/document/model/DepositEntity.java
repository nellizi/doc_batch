package com.inzent.batch.document.model;

import com.inzent.batch.document.config.EntityDate;
import lombok.*;

import javax.persistence.*;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "DEPOSIT_TASK")
public class DepositEntity extends EntityDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long ID;

    @Column(name = "IMG_KEY")
    @Setter
    private String imageKey;

    @Column(name = "CUST_NO")
    @Setter
    private String custNumber;

    @Column(name = "DEL_YN")
    @Setter
    private String checkDelete;

    @Column(name = "TASK_SIZE")
    @Setter
    private Long task_size;

}
