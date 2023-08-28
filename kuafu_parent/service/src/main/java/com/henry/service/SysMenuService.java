package com.henry.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.henry.model.sys.SysMenu;
import com.henry.vo.vo.sys.RouterVo;
import com.henry.vo.query.sys.SysMenuQueryVo;

import java.util.List;

/**
 * @description 菜单权限表 服务类
 * @author Henry
 * @since 2023-05-18
 */
public interface SysMenuService extends IService<SysMenu> {

    List<SysMenu> getMenuList(SysMenuQueryVo sysMenuQueryVo);

    List<RouterVo> getUserMenuList(Long userId);

    List<String> getUserButtonList(Long userId);

    void saveMenu(SysMenu sysMenu);

    List<SysMenu> getModuleList();
}
