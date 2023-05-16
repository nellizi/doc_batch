package com.inzent.batch.document.model;


import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "COMMON_TASK")
public class CommonEntity {

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
    @UpdateTimestamp
    @Column(name = "regDate")
    private LocalDateTime regDate;

    @Column(name = "Create_Usr")
    @Setter
    private String createUser;

    @Setter
    @UpdateTimestamp
    @Column(name = "updateDate")
    private LocalDateTime updateAt;

    @Column(name = "Update_Usr")
    @Setter
    private String updateUser;

    @Column(name = "DEL_YN")
    @Setter
    private String checkDelete;



}
