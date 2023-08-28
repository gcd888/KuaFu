package com.henry.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.henry.model.sys.SysMenu;
import com.henry.model.sys.SysRoleMenu;
import com.henry.vo.vo.sys.AssignMenuVo;

import java.util.List;

/**
 * <p>
 * 角色菜单关联表 服务类
 * </p>
 *
 * @author Henry
 * @since 2023-05-21
 */
public interface SysRoleMenuService extends IService<SysRoleMenu> {

    List<SysMenu> toAssignMenu(Long roleId);

    void doAssignMenu(AssignMenuVo assignMenuVo);

}
