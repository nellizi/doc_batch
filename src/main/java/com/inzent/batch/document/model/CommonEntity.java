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
@Table(name = "COMMON_TASK")
public class CommonEntity extends EntityDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long ID;

    @Column(name = "IMG_KEY")
    @Setter
    private String imageKey;   //업무키

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
