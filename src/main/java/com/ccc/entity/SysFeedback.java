package com.ccc.entity;

import com.ccc.base.entity.ResultInfo;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * 问题反馈
 */
@Data
@Entity
@Table
public class SysFeedback extends ResultInfo {

    @Id
    @Column
    private Integer questionId;

    @Column
    private String questionContent;

    @Column
    private String questionUser;

    @Column
    private String questionTellphone;

    @Column
    private Integer questionTenantId;

    @Column
    private String questionTenantName;

    @Column
    private String createTime;

    /*@Column
    private List<Integer> fileIds;*/

    @Column
    private String fileUrl;

    @Column
    private int questionStatu;

    @Column
    private String title;

    @Column
    private int cnt;

    @Column
    private String replyUser;

}