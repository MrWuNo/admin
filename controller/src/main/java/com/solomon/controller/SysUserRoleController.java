package com.solomon.controller;

import com.solomon.entity.SysUserRole;
import com.solomon.service.SysUserRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户权限关联表(SysUserRole)表控制层
 *
 * @author makejava
 * @since 2018-12-21 13:14:40
 */
@RestController
@RequestMapping("sysUserRole")
public class SysUserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserRoleService sysUserRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUserRole selectOne(Long id) {
        return this.sysUserRoleService.queryById(id);
    }

}