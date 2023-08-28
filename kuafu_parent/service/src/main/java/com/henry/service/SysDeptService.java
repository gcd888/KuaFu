package com.henry.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.henry.model.sys.SysDept;
import com.henry.vo.query.sys.SysDeptQueryVo;

import java.util.List;

/**
 * @description 组织架构 服务类
 * @author Henry
 * @since 2023-05-20
 */
public interface SysDeptService extends IService<SysDept> {

    List<SysDept> getTree(SysDeptQueryVo sysDeptQueryVo);

    /**
     * 根据部门编号获取包含其子部门的编号
     * @return ids
     */
    List<Long> getDeptIds(Long deptId);
}
