package com.ccc.entity;

import com.ccc.base.entity.ResultInfo;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 消息列表
 */
@Data
@Entity
@Table(name = "t_sys_msg")
public class SysMsg extends ResultInfo {

    //id
    @Id
    @Column
    private Integer msgId;

    //编号
    @Column
    private String msgNo;

    //标题
    @Column
    private String msgTitle;

    //内容
    @Column
    private String msgContent;

    //类型
    @Column
    private String msgType;

    //创建时间
    @Column
    private Date msgCreateTime;

    //创建者
    @Column
    private String msgCreator;

    //更新人
    @Column
    private String msgUpdateUser;

    //更新时间
    @Column
    private Date msgUpdateTime;

    //状态
    @Column
    private String msgStatus;

    //租户类型：1:个人 , 2:群组
    @Column
    private String msgTenantType;

    //推送时间
    @Column
    private Date msgPushTime;

}