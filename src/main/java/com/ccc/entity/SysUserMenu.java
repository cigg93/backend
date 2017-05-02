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
@Table(name = "t_sys_user_menu")
public class SysUserMenu extends ResultInfo {

    @Id
    @Column
    private int user_menu_id;

    @Column
    private int sys_user_id;

    @Column
    private String user_menu_creator;

    @Column
    private String user_menu_create_time;

    @Column
    private String user_menu_update_user;

    @Column
    private String user_menu_update_time;

    @Column
    private int menuId;

}
