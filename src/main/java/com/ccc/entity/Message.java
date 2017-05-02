package com.ccc.entity;


import com.ccc.base.entity.ResultInfo;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ccc on 2016/8/5.
 */
@Data
@Entity
@Table(name = "t_sys_msg")
public class Message extends ResultInfo {

    @Id
    @Column
    private int msgId;

    @Column
    private String msgTitle;

    @Column
    private String msgContent;

    @Column
    private String msgType;

    @Column
    private String msgCreateTime;

    @Column
    private String msgCreator;

    @Column
    private String msgUpdateUser;

    @Column
    private String msgUpdateTime;

    @Column
    private String msgExpiryTime;

    @Column
    private String msgStatus;

    @Column
    private int msgValidCount;//有效消息总数

    @Column
    private int msgInvalidCount; //失效消息总数

    @Column
    private String msgNo;

    @Column
    private String msgPushTime;

    /*@Column
    private List<SysTenantMessage> userlist;

    @Column
    private List<SysTenantMessage> userTypelist;*/

    @Column
    private String tenantTypes;

    @Column
    private String tenantPhones;

    @Column
    private String msgTenantType;

}
