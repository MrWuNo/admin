package com.solomon.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 后台管理用户表(SysUser)实体类
 *
 * @author makejava
 * @since 2018-12-21 13:14:40
 */
public class SysUser implements Serializable {
    private static final long serialVersionUID = 814084513413265952L;
    //主键ID
    private Integer id;
    //用户名（登陆用）
    private String name;
    //密码MD5加密
    private String password;
    //手机号码
    private String phone;
    //昵称
    private String nickname;
    //个人描述
    private String describe;
    //创建日期
    private Date createDate;
    //创建人
    private String createBy;
    //更新日期
    private Date updateDate;
    //更新人
    private Integer updateBy;
    //逻辑删除
    private Integer delFlag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}