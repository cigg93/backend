package com.ccc.entity;

import java.util.Date;

/**
 * 消息列表
 */
public class SysMsg{

    //id
    private Integer msgId;

    //编号
    private String msgNo;

    //标题
    private String msgTitle;

    //内容
    private String msgContent;

    //类型
    private String msgType;

    //创建时间
    private Date msgCreateTime;

    //创建者
    private String msgCreator;

    //更新人
    private String msgUpdateUser;

    //更新时间
    private Date msgUpdateTime;

    //状态
    private String msgStatus;

    //租户类型：1:个人 , 2:群组
    private String msgTenantType;

    //推送时间
    private Date msgPushTime;

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public String getMsgNo() {
        return msgNo;
    }

    public void setMsgNo(String msgNo) {
        this.msgNo = msgNo == null ? null : msgNo.trim();
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle == null ? null : msgTitle.trim();
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType == null ? null : msgType.trim();
    }

    public Date getMsgCreateTime() {
        return msgCreateTime;
    }

    public void setMsgCreateTime(Date msgCreateTime) {
        this.msgCreateTime = msgCreateTime;
    }

    public String getMsgCreator() {
        return msgCreator;
    }

    public void setMsgCreator(String msgCreator) {
        this.msgCreator = msgCreator == null ? null : msgCreator.trim();
    }

    public String getMsgUpdateUser() {
        return msgUpdateUser;
    }

    public void setMsgUpdateUser(String msgUpdateUser) {
        this.msgUpdateUser = msgUpdateUser == null ? null : msgUpdateUser.trim();
    }

    public Date getMsgUpdateTime() {
        return msgUpdateTime;
    }

    public void setMsgUpdateTime(Date msgUpdateTime) {
        this.msgUpdateTime = msgUpdateTime;
    }

    public String getMsgStatus() {
        return msgStatus;
    }

    public void setMsgStatus(String msgStatus) {
        this.msgStatus = msgStatus == null ? null : msgStatus.trim();
    }

    public String getMsgTenantType() {
        return msgTenantType;
    }

    public void setMsgTenantType(String msgTenantType) {
        this.msgTenantType = msgTenantType == null ? null : msgTenantType.trim();
    }

    public Date getMsgPushTime() {
        return msgPushTime;
    }

    public void setMsgPushTime(Date msgPushTime) {
        this.msgPushTime = msgPushTime;
    }
}