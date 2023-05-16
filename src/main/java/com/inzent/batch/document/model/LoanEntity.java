package com.inzent.batch.document.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "LOAN_TASK")
public class LoanEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IMG_KEY")
    @Setter
    private String imageKey;

    @Column(name = "CUST_NO")
    @Setter
    private String custNumber;

    @Column(name = "CUST_NM")
    @Setter
    private String custName;

    @Column(name = "RRN_NO")
    @Setter
    private String rrgNumber;

    @Setter
    @Column(name = "regDate")
    private Date regDate;

    @Column(name = "Create_Usr")
    @Setter
    private String createUser;

    @Setter
    @Column(name = "updateDate")
    private Date updateAt;

    @Column(name = "Update_Usr")
    @Setter
    private String updateUser;

    @Column(name = "DEL_YN")
    @Setter
    private String checkDelete;

}
