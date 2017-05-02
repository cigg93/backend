package com.ccc.entity;

import com.ccc.base.entity.ResultInfo;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author cai
 *         Created by cai on 2016/8/20.
 */

@Data
@Entity
@Table(name = "t_sys_tenant_msg")
public class SysTenantMessage extends ResultInfo {

    @Id
    @Column
    private int msgId;

    @Column
    private int tenantId;

    @Column
    private String tenantNo;

    @Column
    private String tenantRealName;

    @Column
    private String tenantPhone;

    @Column
    private String tenantType;

    @Column
    private int countType;
}
