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
 * @author cai
 *         Created by cai on 2016/8/8.
 */
@Data
@Entity
@Table(name = "t_sys_menu")
public class SysMenu extends ResultInfo {
    /**
     * 菜单ID
     */
    @Id
    @Column
    private int menuId;

    /**
     * 菜单名称
     */
    @Column
    private String menuName;

    /**
     * 父菜单ID
     */
    @Column
    private int menuParentId;

    /**
     * 菜单URL
     */
    @Column
    private String menuUrl;

    /**
     * 菜单排序
     */
    @Column
    private String menuSort;

    /**
     * 菜单级别
     */
    @Column
    private String menuLevel;

    /**
     * 菜单是否显示
     */
    @Column
    private String menuIsShow;

    /**
     * 菜单创建时间
     */
    @Column
    private String createTime;

    /**
     * 菜单创建者
     */
    @Column
    private String creator;

    /**
     * 菜单更新时间
     */
    @Column
    private String updateTime;

    /**
     * 菜单更新者
     */
    @Column
    private String updateUser;

    /**
     * 父菜单名称
     */
    @Column
    private String parentName;

    /**
     * 路由名称
     */
    @Column
    private String routeName;

    /**
     * 路由请求路径
     */
    @Column
    private String routeUrl;


    /**
     * 路由模板路径
     */
    @Column
    private String routeTempletUrl;

    /**
     * 路由JS或CSS文件集合
     */
    @Column
    private String routeJs;

    /**
     * 菜单集合
     */
    /*@Column
    private List<SysMenu> childrenList;*/

    /**
     * 菜单图标
     */
    @Column
    private String menuIcon;
    /**
     * 角色菜单ID
     */
    @Column
    private int roleMenuId;

}
