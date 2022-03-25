package com.ruoyi.project.quality.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DictUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.bean.BeanUtils;
import com.ruoyi.common.utils.uuid.IdGenerator;
import com.ruoyi.framework.aspectj.lang.annotation.DataSource;
import com.ruoyi.framework.aspectj.lang.enums.DataSourceType;
import com.ruoyi.project.quality.domain.GovernanceAuditField;
import com.ruoyi.project.quality.domain.GovernanceAuditRow;
import com.ruoyi.project.quality.mapper.GovernanceAuditFieldMapper;
import com.ruoyi.project.quality.mapper.GovernanceAuditRowMapper;
import com.ruoyi.project.system.domain.SysDictData;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@Service("governanceProjectBlackListService")
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

            String projectCode = blackList.getProjectCode();
            String tenderProjectCode = blackList.getTenderProjectCode();
            String sectionCodes = blackList.getSectionCode();
            if (StringUtils.isNotEmpty(sectionCodes)) {
                String[] split = sectionCodes.split(",");
                Set<String> codes = new LinkedHashSet<>();
                codes.add(sectionCodes);
                for (String sectionCode : split) {
                    if (StringUtils.isNotEmpty(sectionCode)) {
                        codes.add(sectionCode);
                    }
                }
                for (String sectionCode : codes) {
                    GovernanceAuditRow governanceAuditRowParam = new GovernanceAuditRow();
                    governanceAuditRowParam.setProjectCode(projectCode);
                    governanceAuditRowParam.setTenderProjectCode(tenderProjectCode);
                    governanceAuditRowParam.setSectionCode(sectionCode);
                    excludeTestData(governanceAuditRowParam);
                }
            } else {
                GovernanceAuditRow governanceAuditRowParam = new GovernanceAuditRow();
                governanceAuditRowParam.setProjectCode(projectCode);
                governanceAuditRowParam.setTenderProjectCode(tenderProjectCode);
                excludeTestData(governanceAuditRowParam);
            }
        }
        return 1;
    }

    private void excludeTestData(GovernanceAuditRow governanceAuditRowParam) {
        int rowCount = 0;
        int fieldCount = 0;
        governanceAuditRowParam.setTestData(0);
        List<GovernanceAuditRow> governanceAuditRows = governanceAuditRowMapper.selectGovernanceAuditRowList(governanceAuditRowParam);
        for (GovernanceAuditRow governanceAuditRow : governanceAuditRows) {
            String rowId = governanceAuditRow.getRowId();
            GovernanceAuditRow row = new GovernanceAuditRow();
            row.setRowId(rowId);
            row.setTestData(1);
            rowCount += governanceAuditRowMapper.updateGovernanceAuditRow(row);
            GovernanceAuditField governanceAuditFieldParam = new GovernanceAuditField();
            governanceAuditFieldParam.setRowId(rowId);
            governanceAuditFieldParam.setTestData(0);
            List<GovernanceAuditField> governanceAuditFields = governanceAuditFieldMapper.selectGovernanceAuditFieldList(governanceAuditFieldParam);
            for (GovernanceAuditField governanceAuditField : governanceAuditFields) {
                GovernanceAuditField field = new GovernanceAuditField();
                field.setId(governanceAuditField.getId());
                field.setTestData(1);
                fieldCount += governanceAuditFieldMapper.updateGovernanceAuditField(field);
            }
        }
        log.info("row表中{}条数据被标记为测试数据", rowCount);
        log.info("field表中{}条数据被标记为测试数据", fieldCount);
    }

    @Override
    public String importList(List<GovernanceProjectBlackList> list, boolean updateSupport, String operName) {

        List<SysDictData> bizPlatformId = DictUtils.getDictCache("biz_platform_id");

        int success = 0;
        for (int i = 0; i < list.size(); i++) {
            GovernanceProjectBlackList blackList = list.get(i);
            if (StringUtils.isEmpty(blackList.getTenderProjectCode()) && StringUtils.isEmpty(blackList.getSectionCode()) && StringUtils.isEmpty(blackList.getProjectCode())) {
                throw new ServiceException("第" + (i + 1) + "行数据[建设项目编号/项目编号/标段编号]为空");
            }
            String businessName = blackList.getBusinessName();
            if (StringUtils.isNotEmpty(businessName)) {
                if (businessName.contains("建设") || businessName.contains("工程")) {
                    blackList.setBusinessType(1L);
                }
                if (businessName.contains("采购") || businessName.contains("政采")) {
                    blackList.setBusinessType(2L);
                }
            }
            String platformId = blackList.getPlatformId();
            String platformName = blackList.getPlatformName();
            if (StringUtils.isEmpty(platformId) && StringUtils.isNotEmpty(platformName)) {
                for (SysDictData sysDictData : bizPlatformId) {
                    if (sysDictData.getDictLabel().contains(platformName)) {
                        platformId = sysDictData.getDictValue();
                        break;
                    }
                }
                if (StringUtils.isNotEmpty(platformId)) {
                    blackList.setPlatformId(platformId);
                }
            }
            success += this.insertGovernanceProjectBlackList(blackList);
        }
        if (success < 1) {
            throw new ServiceException("未发现有效数据, 导入失败");
        }
        return "导入成功" + success + "条数据";
    }
}
