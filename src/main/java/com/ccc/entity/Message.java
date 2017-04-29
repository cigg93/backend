package com.ccc.entity;


import com.ccc.base.entity.ResultInfo;
import lombok.Data;

import java.util.List;

/**
 * Created by ccc on 2016/8/5.
 */
@Data
public class Message extends ResultInfo
{
    private int msgId;
    private String msgTitle;
    private String msgContent;
    private String msgType;
    private String msgCreateTime;
    private String msgCreator;
    private String msgUpdateUser;
    private String msgUpdateTime;
    private String msgExpiryTime;
    private String msgStatus;
    private int msgValidCount;//有效消息总数
    private int msgInvalidCount; //失效消息总数
    private String msgNo;
    private String msgPushTime;
    private List<SysTenantMessage> userlist;
    private List<SysTenantMessage> userTypelist;
    private String tenantTypes;
    private String tenantPhones;
    private String msgTenantType;


}
