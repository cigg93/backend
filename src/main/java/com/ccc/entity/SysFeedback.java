package com.ccc.entity;

import com.ccc.base.entity.ResultInfo;
import lombok.Data;

import java.util.List;

/**
 * 问题反馈
 */
@Data
public class SysFeedback extends ResultInfo
{

    private Integer questionId;

    private String questionContent;

    private String questionUser;

    private String questionTellphone;

    private Integer questionTenantId;

    private String questionTenantName;

    private String createTime;

    private List<Integer> fileIds;

    private String fileUrl;

    private int questionStatu;

    private String title;

    private int cnt;

    private String replyUser;

}