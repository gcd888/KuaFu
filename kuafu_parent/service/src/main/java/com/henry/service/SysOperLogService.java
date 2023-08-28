package com.henry.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.henry.model.sys.SysOperLog;
import com.baomidou.mybatisplus.extension.service.IService;
import com.henry.vo.query.sys.SysOperLogQueryVo;

/**
 * @description 操作日志记录 服务类
 * @author Henry
 * @since 2023-05-26
 */
public interface SysOperLogService extends IService<SysOperLog> {

    Page<SysOperLog> getPageList(Integer pageNum, Integer pageSize, SysOperLogQueryVo sysOperLogQueryVo);
}
