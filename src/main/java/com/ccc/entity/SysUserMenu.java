package com.ccc.entity;

import com.ccc.base.entity.ResultInfo;

import java.util.Date;

/**
 * Created by ccc  on 2016/8/8.
 */
public class SysUserMenu extends ResultInfo
{
    private int user_menu_id;

    private int sys_user_id;

    private String user_menu_creator;

    private String user_menu_create_time;

    private String user_menu_update_user;

    private String user_menu_update_time;

    private int menuId;

    public int getUser_menu_id() {
        return user_menu_id;
    }

    public void setUser_menu_id(int user_menu_id) {
        this.user_menu_id = user_menu_id;
    }

    public int getSys_user_id() {
        return sys_user_id;
    }

    public void setSys_user_id(int sys_user_id) {
        this.sys_user_id = sys_user_id;
    }

    public String getUser_menu_creator() {
        return user_menu_creator;
    }

    public void setUser_menu_creator(String user_menu_creator) {
        this.user_menu_creator = user_menu_creator;
    }

    public String getUser_menu_create_time() {
        return user_menu_create_time;
    }

    public void setUser_menu_create_time(String user_menu_create_time) {
        this.user_menu_create_time = user_menu_create_time;
    }

    public void setUser_menu_update_time(String user_menu_update_time) {
        this.user_menu_update_time = user_menu_update_time;
    }

    public String getUser_menu_update_user() {
        return user_menu_update_user;
    }

    public void setUser_menu_update_user(String user_menu_update_user) {
        this.user_menu_update_user = user_menu_update_user;
    }

    public String getUser_menu_update_time() {
        return user_menu_update_time;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }
}
