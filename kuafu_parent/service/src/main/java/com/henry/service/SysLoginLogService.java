package com.henry.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.henry.model.sys.SysLoginLog;
import com.henry.vo.query.sys.SysLoginLogQueryVo;

/**
 * @description 登录日志表 服务类
 * @author Henry
 * @since 2023-05-20
 */
public interface SysLoginLogService extends IService<SysLoginLog> {
    Page<SysLoginLog> getSysLoginLogPage(Integer pageNum, Integer pageSize, SysLoginLogQueryVo sysLoginLogQueryVo);
}
