package com.ccc.entity;

import lombok.Data;

/**
 * Created by ccc  on 2016/8/10.
 */
@Data
public class SysRoleMenu
{
    private int roleMenuId;

    private String roleMenuCreator;

    private String roleMenuCreateTime;

    private String roleMenuUpdateUser;

    private String roleMenuUpdateTime;

    private int roleId;

    private int menuId;

}
