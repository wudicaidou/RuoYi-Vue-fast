package com.ruoyi.project.quality.service;

import java.util.List;

import com.ruoyi.project.quality.domain.CompeleteProcessDetailDaily;

/**
 * 业务流程完整性问题修复Service接口
 *
 * @author cai
 * @date 2022-04-25
 */
public interface ICompeleteProcessDetailDailyService {
    /**
     * 查询业务流程完整性问题修复
     *
     * @param id 业务流程完整性问题修复主键
     * @return 业务流程完整性问题修复
     */
    public CompeleteProcessDetailDaily selectCompeleteProcessDetailDailyById(String id);

    /**
     * 查询业务流程完整性问题修复列表
     *
     * @param compeleteProcessDetailDaily 业务流程完整性问题修复
     * @return 业务流程完整性问题修复集合
     */
    public List<CompeleteProcessDetailDaily> selectCompeleteProcessDetailDailyList(CompeleteProcessDetailDaily compeleteProcessDetailDaily);

    /**
     * 新增业务流程完整性问题修复
     *
     * @param compeleteProcessDetailDaily 业务流程完整性问题修复
     * @return 结果
     */
    public int insertCompeleteProcessDetailDaily(CompeleteProcessDetailDaily compeleteProcessDetailDaily);

    /**
     * 修改业务流程完整性问题修复
     *
     * @param compeleteProcessDetailDaily 业务流程完整性问题修复
     * @return 结果
     */
    public int updateCompeleteProcessDetailDaily(CompeleteProcessDetailDaily compeleteProcessDetailDaily);

    /**
     * 批量删除业务流程完整性问题修复
     *
     * @param ids 需要删除的业务流程完整性问题修复主键集合
     * @return 结果
     */
    public int deleteCompeleteProcessDetailDailyByIds(String[] ids);

    /**
     * 删除业务流程完整性问题修复信息
     *
     * @param id 业务流程完整性问题修复主键
     * @return 结果
     */
    public int deleteCompeleteProcessDetailDailyById(String id);
}
