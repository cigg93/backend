package com.ccc.entity;

import com.ccc.base.entity.ResultInfo;

/**
 * Created by ccc  on 2016/8/8.
 */
public class TenantUser extends ResultInfo
{
    private int tenant_user_id;
    private int tenant_id;
    private String tenant_user_name;
    private String tenant_name;
    private String tenant_check_status;
    private String tenant_user_pwd;
    private String tenant_statu;
    private String user_statu;
    private String db_url;
    private String db_user;
    private String db_pwd;
    private String license;
    private String tenantAccout;

    public int getTenant_user_id() {
        return tenant_user_id;
    }

    public void setTenant_user_id(int tenant_user_id) {
        this.tenant_user_id = tenant_user_id;
    }

    public int getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(int tenant_id) {
        this.tenant_id = tenant_id;
    }

    public String getTenant_user_name() {
        return tenant_user_name;
    }

    public void setTenant_user_name(String tenant_user_name) {
        this.tenant_user_name = tenant_user_name;
    }

    public String getTenant_user_pwd() {
        return tenant_user_pwd;
    }

    public void setTenant_user_pwd(String tenant_user_pwd) {
        this.tenant_user_pwd = tenant_user_pwd;
    }

    public String getTenant_statu() {
        return tenant_statu;
    }

    public void setTenant_statu(String tenant_statu) {
        this.tenant_statu = tenant_statu;
    }

    public String getUser_statu() {
        return user_statu;
    }

    public void setUser_statu(String user_statu) {
        this.user_statu = user_statu;
    }

    public String getDb_url() {
        return db_url;
    }

    public void setDb_url(String db_url) {
        this.db_url = db_url;
    }

    public String getDb_user() {
        return db_user;
    }

    public void setDb_user(String db_user) {
        this.db_user = db_user;
    }

    public String getDb_pwd() {
        return db_pwd;
    }

    public void setDb_pwd(String db_pwd) {
        this.db_pwd = db_pwd;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getTenantAccout() {
        return tenantAccout;
    }

    public void setTenantAccout(String tenantAccout) {
        this.tenantAccout = tenantAccout;
    }

    public String getTenant_name() {
        return tenant_name;
    }

    public void setTenant_name(String tenant_name) {
        this.tenant_name = tenant_name;
    }

    public String getTenant_check_status() {
        return tenant_check_status;
    }

    public void setTenant_check_status(String tenant_check_status) {
        this.tenant_check_status = tenant_check_status;
    }
}
