package com.ruoyi.project.quality.service.impl;

import java.util.List;

import com.ruoyi.framework.aspectj.lang.annotation.DataSource;
import com.ruoyi.framework.aspectj.lang.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.quality.mapper.GovernanceAuditRowMapper;
import com.ruoyi.project.quality.domain.GovernanceAuditRow;
import com.ruoyi.project.quality.service.IGovernanceAuditRowService;

/**
 * 数据治理行结果Service业务层处理
 * 
 * @author cai
 * @date 2022-03-24
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class GovernanceAuditRowServiceImpl implements IGovernanceAuditRowService 
{
    @Autowired
    private GovernanceAuditRowMapper governanceAuditRowMapper;

    /**
     * 查询数据治理行结果
     * 
     * @param rowId 数据治理行结果主键
     * @return 数据治理行结果
     */
    @Override
    public GovernanceAuditRow selectGovernanceAuditRowByRowId(String rowId)
    {
        return governanceAuditRowMapper.selectGovernanceAuditRowByRowId(rowId);
    }

    /**
     * 查询数据治理行结果列表
     * 
     * @param governanceAuditRow 数据治理行结果
     * @return 数据治理行结果
     */
    @Override
    public List<GovernanceAuditRow> selectGovernanceAuditRowList(GovernanceAuditRow governanceAuditRow)
    {
        return governanceAuditRowMapper.selectGovernanceAuditRowList(governanceAuditRow);
    }

    /**
     * 新增数据治理行结果
     * 
     * @param governanceAuditRow 数据治理行结果
     * @return 结果
     */
    @Override
    public int insertGovernanceAuditRow(GovernanceAuditRow governanceAuditRow)
    {
        return governanceAuditRowMapper.insertGovernanceAuditRow(governanceAuditRow);
    }

    /**
     * 修改数据治理行结果
     * 
     * @param governanceAuditRow 数据治理行结果
     * @return 结果
     */
    @Override
    public int updateGovernanceAuditRow(GovernanceAuditRow governanceAuditRow)
    {
        return governanceAuditRowMapper.updateGovernanceAuditRow(governanceAuditRow);
    }

    /**
     * 批量删除数据治理行结果
     * 
     * @param rowIds 需要删除的数据治理行结果主键
     * @return 结果
     */
    @Override
    public int deleteGovernanceAuditRowByRowIds(String[] rowIds)
    {
        return governanceAuditRowMapper.deleteGovernanceAuditRowByRowIds(rowIds);
    }

    /**
     * 删除数据治理行结果信息
     * 
     * @param rowId 数据治理行结果主键
     * @return 结果
     */
    @Override
    public int deleteGovernanceAuditRowByRowId(String rowId)
    {
        return governanceAuditRowMapper.deleteGovernanceAuditRowByRowId(rowId);
    }
}
