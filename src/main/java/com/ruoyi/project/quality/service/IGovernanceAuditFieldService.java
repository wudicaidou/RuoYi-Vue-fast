package com.ruoyi.project.quality.service;

import java.util.List;
import com.ruoyi.project.quality.domain.GovernanceAuditField;

/**
 * 数据治理字段结果Service接口
 * 
 * @author cai
 * @date 2022-03-24
 */
public interface IGovernanceAuditFieldService 
{
    /**
     * 查询数据治理字段结果
     * 
     * @param id 数据治理字段结果主键
     * @return 数据治理字段结果
     */
    public GovernanceAuditField selectGovernanceAuditFieldById(String id);

    /**
     * 查询数据治理字段结果列表
     * 
     * @param governanceAuditField 数据治理字段结果
     * @return 数据治理字段结果集合
     */
    public List<GovernanceAuditField> selectGovernanceAuditFieldList(GovernanceAuditField governanceAuditField);

    /**
     * 新增数据治理字段结果
     * 
     * @param governanceAuditField 数据治理字段结果
     * @return 结果
     */
    public int insertGovernanceAuditField(GovernanceAuditField governanceAuditField);

    /**
     * 修改数据治理字段结果
     * 
     * @param governanceAuditField 数据治理字段结果
     * @return 结果
     */
    public int updateGovernanceAuditField(GovernanceAuditField governanceAuditField);

    /**
     * 批量删除数据治理字段结果
     * 
     * @param ids 需要删除的数据治理字段结果主键集合
     * @return 结果
     */
    public int deleteGovernanceAuditFieldByIds(String[] ids);

    /**
     * 删除数据治理字段结果信息
     * 
     * @param id 数据治理字段结果主键
     * @return 结果
     */
    public int deleteGovernanceAuditFieldById(String id);
}