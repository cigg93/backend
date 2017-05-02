package com.ccc.entity;

import com.ccc.base.entity.ResultInfo;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by ccc  on 2016/8/8.
 */
@Data
@Entity
@Table(name = "t_sys_tenant")
public class Tenant extends ResultInfo {
    @Id
    @Column
    private int tenantId;

    @Column
    private String tenantNo;

    @Column
    private String tenantType;

    @Column
    private String tenantName;

    @Column
    private String tenantPwd;

    @Column
    private String tenantRealName;

    @Column
    private String tenantCardNo;

    @Column
    private String tenantCardImgUrl;

    @Column
    private String tenantPhone;

    @Column
    private String tenantEmail;

    @Column
    private String tenantCompany;

    @Column
    private String tenantLicenseImgUrl;

    @Column
    private String tenantRegisterTime;

    @Column
    private String tenantLastLoginTime;

    @Column
    private String tenantEndTime;

    @Column
    private String tenantStatus;

    @Column
    private String userId;

    @Column
    private String tenantCheckTime;

    @Column
    private String tenantCheckStatus;

    @Column
    private String tenantRemark;

    @Column
    private String tenantUpdateUser;

    @Column
    private String tenantUpdateTime;

    @Column
    private String checkUser;
}
