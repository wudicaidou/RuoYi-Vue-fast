package com.ruoyi.project.quality.service;

import java.util.List;

import com.ruoyi.project.quality.domain.CompeleteMessageDetailDaily;

/**
 * 公开信息完整性问题关闭Service接口
 *
 * @author cai
 * @date 2022-04-25
 */
public interface ICompeleteMessageDetailDailyService {
    /**
     * 查询公开信息完整性问题关闭
     *
     * @param id 公开信息完整性问题关闭主键
     * @return 公开信息完整性问题关闭
     */
    public CompeleteMessageDetailDaily selectCompeleteMessageDetailDailyById(String id);

    /**
     * 查询公开信息完整性问题关闭列表
     *
     * @param compeleteMessageDetailDaily 公开信息完整性问题关闭
     * @return 公开信息完整性问题关闭集合
     */
    public List<CompeleteMessageDetailDaily> selectCompeleteMessageDetailDailyList(CompeleteMessageDetailDaily compeleteMessageDetailDaily);

    /**
     * 新增公开信息完整性问题关闭
     *
     * @param compeleteMessageDetailDaily 公开信息完整性问题关闭
     * @return 结果
     */
    public int insertCompeleteMessageDetailDaily(CompeleteMessageDetailDaily compeleteMessageDetailDaily);

    /**
     * 修改公开信息完整性问题关闭
     *
     * @param compeleteMessageDetailDaily 公开信息完整性问题关闭
     * @return 结果
     */
    public int updateCompeleteMessageDetailDaily(CompeleteMessageDetailDaily compeleteMessageDetailDaily);

    /**
     * 批量删除公开信息完整性问题关闭
     *
     * @param ids 需要删除的公开信息完整性问题关闭主键集合
     * @return 结果
     */
    public int deleteCompeleteMessageDetailDailyByIds(String[] ids);

    public int closeCompeleteMessageDetailDailyByIds(String[] ids);

    /**
     * 删除公开信息完整性问题关闭信息
     *
     * @param id 公开信息完整性问题关闭主键
     * @return 结果
     */
    public int deleteCompeleteMessageDetailDailyById(String id);
}
