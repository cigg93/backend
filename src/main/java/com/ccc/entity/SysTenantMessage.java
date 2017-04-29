package com.ccc.entity;

import com.ccc.base.entity.ResultInfo;

/** @author cai
 * Created by cai on 2016/8/20.
 */
public class SysTenantMessage extends ResultInfo
{

    private int msgId;
    private int tenantId;
    private String tenantNo;
    private String tenantRealName;
    private String tenantPhone;
    private String tenantType;
    private int countType;

    public int getMsgId()
    {
        return msgId;
    }

    public void setMsgId(int msgId)
    {
        this.msgId = msgId;
    }

    public int getTenantId()
    {
        return tenantId;
    }

    public void setTenantId(int tenantId)
    {
        this.tenantId = tenantId;
    }

    public String getTenantNo()
    {
        return tenantNo;
    }

    public void setTenantNo(String tenantNo)
    {
        this.tenantNo = tenantNo;
    }

    public String getTenantRealName()
    {
        return tenantRealName;
    }

    public void setTenantRealName(String tenantRealName)
    {
        this.tenantRealName = tenantRealName;
    }

    public String getTenantPhone()
    {
        return tenantPhone;
    }

    public void setTenantPhone(String tenantPhone)
    {
        this.tenantPhone = tenantPhone;
    }

    public String getTenantType() {
        return tenantType;
    }

    public void setTenantType(String tenantType) {
        this.tenantType = tenantType;
    }

    public int getCountType() {
        return countType;
    }

    public void setCountType(int countType) {
        this.countType = countType;
    }
}
