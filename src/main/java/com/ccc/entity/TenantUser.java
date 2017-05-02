package com.ccc.entity;

import com.ccc.base.entity.ResultInfo;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ccc  on 2016/8/8.
 */
@Data
@Entity
@Table(name = "t_tenant_user")
public class TenantUser extends ResultInfo {

    @Id
    @Column
    private int tenant_user_id;

    @Column
    private int tenant_id;

    @Column
    private String tenant_user_name;

    @Column
    private String tenant_name;

    @Column
    private String tenant_check_status;

    @Column
    private String tenant_user_pwd;

    @Column
    private String tenant_statu;

    @Column
    private String user_statu;

    @Column
    private String db_url;

    @Column
    private String db_user;

    @Column
    private String db_pwd;

    @Column
    private String license;

    @Column
    private String tenantAccout;

}
