package com.ruoyi.project.quality.service;

import java.util.List;
import com.ruoyi.project.quality.domain.GovernanceAuditRow;

/**
 * 数据治理行结果Service接口
 * 
 * @author cai
 * @date 2022-03-24
 */
public interface IGovernanceAuditRowService 
{
    /**
     * 查询数据治理行结果
     * 
     * @param rowId 数据治理行结果主键
     * @return 数据治理行结果
     */
    public GovernanceAuditRow selectGovernanceAuditRowByRowId(String rowId);

    /**
     * 查询数据治理行结果列表
     * 
     * @param governanceAuditRow 数据治理行结果
     * @return 数据治理行结果集合
     */
    public List<GovernanceAuditRow> selectGovernanceAuditRowList(GovernanceAuditRow governanceAuditRow);

    /**
     * 新增数据治理行结果
     * 
     * @param governanceAuditRow 数据治理行结果
     * @return 结果
     */
    public int insertGovernanceAuditRow(GovernanceAuditRow governanceAuditRow);

    /**
     * 修改数据治理行结果
     * 
     * @param governanceAuditRow 数据治理行结果
     * @return 结果
     */
    public int updateGovernanceAuditRow(GovernanceAuditRow governanceAuditRow);

    /**
     * 批量删除数据治理行结果
     * 
     * @param rowIds 需要删除的数据治理行结果主键集合
     * @return 结果
     */
    public int deleteGovernanceAuditRowByRowIds(String[] rowIds);

    /**
     * 删除数据治理行结果信息
     * 
     * @param rowId 数据治理行结果主键
     * @return 结果
     */
    public int deleteGovernanceAuditRowByRowId(String rowId);
}
