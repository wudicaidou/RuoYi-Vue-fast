package com.ruoyi.project.quality.service.impl;

import java.util.List;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.bean.BeanUtils;
import com.ruoyi.common.utils.uuid.IdGenerator;
import com.ruoyi.framework.aspectj.lang.annotation.DataSource;
import com.ruoyi.framework.aspectj.lang.enums.DataSourceType;
import com.ruoyi.project.quality.domain.GovernanceAuditField;
import com.ruoyi.project.quality.domain.GovernanceAuditRow;
import com.ruoyi.project.quality.mapper.GovernanceAuditFieldMapper;
import com.ruoyi.project.quality.mapper.GovernanceAuditRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.quality.mapper.GovernanceProjectBlackListMapper;
import com.ruoyi.project.quality.domain.GovernanceProjectBlackList;
import com.ruoyi.project.quality.service.IGovernanceProjectBlackListService;

/**
 * 测试数据黑名单Service业务层处理
 *
 * @author cai
 * @date 2022-03-24
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class GovernanceProjectBlackListServiceImpl implements IGovernanceProjectBlackListService {

    @Autowired
    private GovernanceProjectBlackListMapper governanceProjectBlackListMapper;

    @Autowired
    private GovernanceAuditFieldMapper governanceAuditFieldMapper;

    @Autowired
    private GovernanceAuditRowMapper governanceAuditRowMapper;

    /**
     * 查询测试数据黑名单
     *
     * @param id 测试数据黑名单主键
     * @return 测试数据黑名单
     */
    @Override
    public GovernanceProjectBlackList selectGovernanceProjectBlackListById(String id) {
        return governanceProjectBlackListMapper.selectGovernanceProjectBlackListById(id);
    }

    /**
     * 查询测试数据黑名单列表
     *
     * @param governanceProjectBlackList 测试数据黑名单
     * @return 测试数据黑名单
     */
    @Override
    public List<GovernanceProjectBlackList> selectGovernanceProjectBlackListList(GovernanceProjectBlackList governanceProjectBlackList) {
        return governanceProjectBlackListMapper.selectGovernanceProjectBlackListList(governanceProjectBlackList);
    }

    /**
     * 新增测试数据黑名单
     *
     * @param governanceProjectBlackList 测试数据黑名单
     * @return 结果
     */
    @Override
    public int insertGovernanceProjectBlackList(GovernanceProjectBlackList governanceProjectBlackList) {
        governanceProjectBlackList.setId(IdGenerator.generatorId());
        return governanceProjectBlackListMapper.insertGovernanceProjectBlackList(governanceProjectBlackList);
    }

    /**
     * 修改测试数据黑名单
     *
     * @param governanceProjectBlackList 测试数据黑名单
     * @return 结果
     */
    @Override
    public int updateGovernanceProjectBlackList(GovernanceProjectBlackList governanceProjectBlackList) {
        return governanceProjectBlackListMapper.updateGovernanceProjectBlackList(governanceProjectBlackList);
    }

    /**
     * 批量删除测试数据黑名单
     *
     * @param ids 需要删除的测试数据黑名单主键
     * @return 结果
     */
    @Override
    public int deleteGovernanceProjectBlackListByIds(String[] ids) {
        return governanceProjectBlackListMapper.deleteGovernanceProjectBlackListByIds(ids);
    }

    /**
     * 删除测试数据黑名单信息
     *
     * @param id 测试数据黑名单主键
     * @return 结果
     */
    @Override
    public int deleteGovernanceProjectBlackListById(String id) {
        return governanceProjectBlackListMapper.deleteGovernanceProjectBlackListById(id);
    }

    @Override
    public int excludeGovernanceProjectBlackList() {
        List<GovernanceProjectBlackList> blackLists = selectGovernanceProjectBlackListList(new GovernanceProjectBlackList());
        for (GovernanceProjectBlackList blackList : blackLists) {
            String sectionCodes = blackList.getSectionCode();
            String[] split = sectionCodes.split(",");
            for (String sectionCode : split) {
                GovernanceAuditRow governanceAuditRowParam = new GovernanceAuditRow();
                governanceAuditRowParam.setTenderProjectCode(blackList.getTenderProjectCode());
                governanceAuditRowParam.setSectionCode(sectionCode);
                List<GovernanceAuditRow> governanceAuditRows = governanceAuditRowMapper.selectGovernanceAuditRowList(governanceAuditRowParam);
                for (GovernanceAuditRow governanceAuditRow : governanceAuditRows) {
                    String rowId = governanceAuditRow.getRowId();
                    GovernanceAuditRow row = new GovernanceAuditRow();
                    row.setRowId(rowId);
                    row.setTestData(1);
                    governanceAuditRowMapper.updateGovernanceAuditRow(row);
                    GovernanceAuditField governanceAuditFieldParam = new GovernanceAuditField();
                    governanceAuditFieldParam.setRowId(rowId);
                    List<GovernanceAuditField> governanceAuditFields = governanceAuditFieldMapper.selectGovernanceAuditFieldList(governanceAuditFieldParam);
                    for (GovernanceAuditField governanceAuditField : governanceAuditFields) {
                        GovernanceAuditField field = new GovernanceAuditField();
                        field.setId(governanceAuditField.getId());
                        field.setTestData(1);
                        governanceAuditFieldMapper.updateGovernanceAuditField(field);
                    }
                }
            }
        }
        return 1;
    }

    @Override
    public String importList(List<GovernanceProjectBlackList> list, boolean updateSupport, String operName) {
        int success = 0;
        for (int i = 0; i < list.size(); i++) {
            GovernanceProjectBlackList blackList = list.get(i);
            if (StringUtils.isEmpty(blackList.getTenderProjectCode())) {
                throw new ServiceException("第" + (i + 1) + "行数据[项目编号]为空");
            }
            if (StringUtils.isEmpty(blackList.getSectionCode())) {
                throw new ServiceException("第" + (i + 1) + "行数据[标段编号]为空");
            }
            success += this.insertGovernanceProjectBlackList(blackList);
        }
        if (success < 1) {
            throw new ServiceException("未发现有效数据, 导入失败");
        }
        return "导入成功" + success + "条数据";
    }
}
