package com.ccc.entity;

import com.ccc.base.entity.ResultInfo;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * @author ccc
 *         Created by ccc on 2016/8/8.
 */
@Data
@Entity
@Table(name = "t_sys_role")
public class SysRole extends ResultInfo {
    /**
     * 角色ID
     */
    @Id
    @Column
    private int roleId;

    /**
     * 角色名称
     */
    @Column
    private String roleName;

    /**
     * 角色创建者
     */
    @Column
    private String roleCreator;

    /**
     * 角色创建时间
     */
    @Column
    private String roleCreateTime;

    /**
     * 角色更新者
     */
    @Column
    private String roleUpdateUser;

    /**
     * 角色更新时间
     */
    @Column
    private String roleUpdateTime;

    /**
     * 角色说明
     */
    @Column
    private String roleRemark;

    /**
     * 角色菜单列表
     */
//    private List<SysMenu> roleMenuList;


}
