package com.solomon.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 后台菜单表(SysMenu)实体类
 *
 * @author makejava
 * @since 2018-12-21 13:14:40
 */
public class SysMenu implements Serializable {
    private static final long serialVersionUID = -98340357643894129L;
    //主键ID
    private Long id;
    //菜单名称
    private String title;
    //访问路径
    private String url;
    //图标路径
    private String icon;
    //类型，0 菜单，1 连接网址,2 隐藏连接
    private Object menuType;
    //显示排序
    private Integer sort;
    //父级ID，引用本表id字段
    private Long parentId;
    //是否启用，0 禁用，1启用
    private Object status;
    //创建人
    private Long createBy;
    //创建时间
    private Date createTime;
    //更新人
    private Long updateBy;
    //更新时间
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Object getMenuType() {
        return menuType;
    }

    public void setMenuType(Object menuType) {
        this.menuType = menuType;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
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