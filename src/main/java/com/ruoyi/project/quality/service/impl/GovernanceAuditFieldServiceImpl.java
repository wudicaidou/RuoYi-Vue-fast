package com.ruoyi.project.quality.service.impl;

import java.util.List;

import com.ruoyi.framework.aspectj.lang.annotation.DataSource;
import com.ruoyi.framework.aspectj.lang.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.quality.mapper.GovernanceAuditFieldMapper;
import com.ruoyi.project.quality.domain.GovernanceAuditField;
import com.ruoyi.project.quality.service.IGovernanceAuditFieldService;

/**
 * 数据治理字段结果Service业务层处理
 * 
 * @author cai
 * @date 2022-03-24
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class GovernanceAuditFieldServiceImpl implements IGovernanceAuditFieldService 
{
    @Autowired
    private GovernanceAuditFieldMapper governanceAuditFieldMapper;

    /**
     * 查询数据治理字段结果
     * 
     * @param id 数据治理字段结果主键
     * @return 数据治理字段结果
     */
    @Override
    public GovernanceAuditField selectGovernanceAuditFieldById(String id)
    {
        return governanceAuditFieldMapper.selectGovernanceAuditFieldById(id);
    }

    /**
     * 查询数据治理字段结果列表
     * 
     * @param governanceAuditField 数据治理字段结果
     * @return 数据治理字段结果
     */
    @Override
    public List<GovernanceAuditField> selectGovernanceAuditFieldList(GovernanceAuditField governanceAuditField)
    {
        return governanceAuditFieldMapper.selectGovernanceAuditFieldList(governanceAuditField);
    }

    /**
     * 新增数据治理字段结果
     * 
     * @param governanceAuditField 数据治理字段结果
     * @return 结果
     */
    @Override
    public int insertGovernanceAuditField(GovernanceAuditField governanceAuditField)
    {
        return governanceAuditFieldMapper.insertGovernanceAuditField(governanceAuditField);
    }

    /**
     * 修改数据治理字段结果
     * 
     * @param governanceAuditField 数据治理字段结果
     * @return 结果
     */
    @Override
    public int updateGovernanceAuditField(GovernanceAuditField governanceAuditField)
    {
        return governanceAuditFieldMapper.updateGovernanceAuditField(governanceAuditField);
    }

    /**
     * 批量删除数据治理字段结果
     * 
     * @param ids 需要删除的数据治理字段结果主键
     * @return 结果
     */
    @Override
    public int deleteGovernanceAuditFieldByIds(String[] ids)
    {
        return governanceAuditFieldMapper.deleteGovernanceAuditFieldByIds(ids);
    }

    /**
     * 删除数据治理字段结果信息
     * 
     * @param id 数据治理字段结果主键
     * @return 结果
     */
    @Override
    public int deleteGovernanceAuditFieldById(String id)
    {
        return governanceAuditFieldMapper.deleteGovernanceAuditFieldById(id);
    }
}
