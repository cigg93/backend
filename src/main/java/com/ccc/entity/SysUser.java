package com.ccc.entity;

import com.ccc.base.entity.ResultInfo;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 系统用户
 *
 * @author ccc
 *         Created by ccc  on 2016/8/2.
 */

@Data
@Entity
@Table(name = "t_sys_user")
public class SysUser extends ResultInfo {
    /**
     * 用户id
     */
    @Id
    @Column
    private int sysUserId;

    /**
     * 用户名
     */
    @Column
    private String sysUserName;

    /**
     * 密码
     */
    @Column
    private String sysUserPwd;

    /**
     * 创建者
     */
    @Column
    private String sysUserCreator;

    /**
     * 注册时间
     */
    @Column
    private String sysUserCreateTime;

    /**
     * 最近一次登录时间
     */
    @Column
    private String sysUserLastLoginTime;

    /**
     * 状态：0:激活 1:冻结
     */
    @Column
    private String sysUserStatus;

    /**
     * 用户菜单列表
     */
//    private List<SysUserMenu> userMenuList;

    /**
     * 用户修改者
     */
    @Column
    private String sysUserUpdateUser;

    /**
     * 激活用户数
     */
//    private int validUserCount;

    /**
     * 冻结用户数
     */
//    private int invalidUserCount;


    /*租户账号*/
//    @Column
//    private String tenantAccout;

    /**
     * 菜单集合
     */
//    private List<SysMenu> menuList;

    /**
     * 角色ID
     */
    @Column
    private int roleId;

//    @Column
//    private String roleName;

    @Column
    private String sysUserUpdateTime;

}
