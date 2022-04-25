package com.ruoyi.project.quality.service.impl;

import java.util.List;

import com.ruoyi.framework.aspectj.lang.annotation.DataSource;
import com.ruoyi.framework.aspectj.lang.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.quality.mapper.CompeleteProcessDetailDailyMapper;
import com.ruoyi.project.quality.domain.CompeleteProcessDetailDaily;
import com.ruoyi.project.quality.service.ICompeleteProcessDetailDailyService;

/**
 * 业务流程完整性问题修复Service业务层处理
 *
 * @author cai
 * @date 2022-04-25
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class CompeleteProcessDetailDailyServiceImpl implements ICompeleteProcessDetailDailyService {
    @Autowired
    private CompeleteProcessDetailDailyMapper compeleteProcessDetailDailyMapper;

    /**
     * 查询业务流程完整性问题修复
     *
     * @param id 业务流程完整性问题修复主键
     * @return 业务流程完整性问题修复
     */
    @Override
    public CompeleteProcessDetailDaily selectCompeleteProcessDetailDailyById(String id) {
        return compeleteProcessDetailDailyMapper.selectCompeleteProcessDetailDailyById(id);
    }

    /**
     * 查询业务流程完整性问题修复列表
     *
     * @param compeleteProcessDetailDaily 业务流程完整性问题修复
     * @return 业务流程完整性问题修复
     */
    @Override
    public List<CompeleteProcessDetailDaily> selectCompeleteProcessDetailDailyList(CompeleteProcessDetailDaily compeleteProcessDetailDaily) {
        return compeleteProcessDetailDailyMapper.selectCompeleteProcessDetailDailyList(compeleteProcessDetailDaily);
    }

    /**
     * 新增业务流程完整性问题修复
     *
     * @param compeleteProcessDetailDaily 业务流程完整性问题修复
     * @return 结果
     */
    @Override
    public int insertCompeleteProcessDetailDaily(CompeleteProcessDetailDaily compeleteProcessDetailDaily) {
        return compeleteProcessDetailDailyMapper.insertCompeleteProcessDetailDaily(compeleteProcessDetailDaily);
    }

    /**
     * 修改业务流程完整性问题修复
     *
     * @param compeleteProcessDetailDaily 业务流程完整性问题修复
     * @return 结果
     */
    @Override
    public int updateCompeleteProcessDetailDaily(CompeleteProcessDetailDaily compeleteProcessDetailDaily) {
        return compeleteProcessDetailDailyMapper.updateCompeleteProcessDetailDaily(compeleteProcessDetailDaily);
    }

    /**
     * 批量删除业务流程完整性问题修复
     *
     * @param ids 需要删除的业务流程完整性问题修复主键
     * @return 结果
     */
    @Override
    public int deleteCompeleteProcessDetailDailyByIds(String[] ids) {
        return compeleteProcessDetailDailyMapper.deleteCompeleteProcessDetailDailyByIds(ids);
    }

    /**
     * 删除业务流程完整性问题修复信息
     *
     * @param id 业务流程完整性问题修复主键
     * @return 结果
     */
    @Override
    public int deleteCompeleteProcessDetailDailyById(String id) {
        return compeleteProcessDetailDailyMapper.deleteCompeleteProcessDetailDailyById(id);
    }
}
