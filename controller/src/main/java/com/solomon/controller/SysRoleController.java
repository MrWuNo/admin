package com.solomon.controller;

import com.solomon.entity.SysRole;
import com.solomon.service.SysRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.ws.rs.Path;

/**
 * 后台角色表(SysRole)表控制层
 *
 * @author makejava
 * @since 2018-12-21 13:14:40
 */
@RestController
@RequestMapping("sysRole")
public class SysRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleService sysRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysRole selectOne(Long id) {
        return this.sysRoleService.queryById(id);
    }

}