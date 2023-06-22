package com.inzent.batch.document.model;


import com.inzent.batch.document.config.EntityDate;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "INTEGRATED_TASK")
public class IntegratedEntity extends EntityDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long integratedId;

    @Column(name = "IMG_KEY")
    @Setter
    private String imageKey;

    @Column(name = "ELEMENTID")
    @Setter
    private String elementId;

    @Column(name = "SEQ_NO")
    @Setter
    private String seqNo;

    @Column(name = "DOC_CD")
    @Setter
    private String documentCd;

    @Setter
    @Column(name = "DEL_DATE")
    private LocalDateTime deleteDate;

    @Column(name = "TASK_CD")
    @Setter
    private String taskCode;

    @Column(name = "FILE_NM")
    @Setter
    private String fileName;

    @Column(name = "EXTENTION")
    @Setter
    private String extension;

    @Column(name = "DEL_YN")
    @Setter
    private String checkDelete;

}
