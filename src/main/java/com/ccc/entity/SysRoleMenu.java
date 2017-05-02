package com.ccc.entity;

import com.ccc.base.entity.ResultInfo;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ccc  on 2016/8/10.
 */
@Data
@Entity
@Table(name = "t_sys_role_menu")
public class SysRoleMenu extends ResultInfo {

    @Id
    @Column
    private int roleMenuId;

    @Column
    private String roleMenuCreator;

    @Column
    private String roleMenuCreateTime;

    @Column
    private String roleMenuUpdateUser;

    @Column
    private String roleMenuUpdateTime;

    @Column
    private int roleId;

    @Column
    private int menuId;

}
