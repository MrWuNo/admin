package com.solomon.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 权限菜单关联表(SysRoleMenu)实体类
 *
 * @author makejava
 * @since 2018-12-21 13:14:40
 */
public class SysRoleMenu implements Serializable {
    private static final long serialVersionUID = 475489257648326042L;
    //角色ID
    private Long roleId;
    //菜单ID
    private Long menuId;
    //创建用户
    private Long createBy;
    //创建时间
    private Date createTime;
    //更新用户
    private Long updateBy;
    //更新时间
    private Date updateTime;


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}