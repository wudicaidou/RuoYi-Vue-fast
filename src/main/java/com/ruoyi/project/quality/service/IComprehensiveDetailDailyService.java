package com.ruoyi.project.quality.service;

import java.util.List;

import com.ruoyi.project.quality.domain.ComprehensiveDetailDaily;

/**
 * 全面性问题关闭Service接口
 *
 * @author cai
 * @date 2022-04-25
 */
public interface IComprehensiveDetailDailyService {
    /**
     * 查询全面性问题关闭
     *
     * @param id 全面性问题关闭主键
     * @return 全面性问题关闭
     */
    public ComprehensiveDetailDaily selectComprehensiveDetailDailyById(String id);

    /**
     * 查询全面性问题关闭列表
     *
     * @param comprehensiveDetailDaily 全面性问题关闭
     * @return 全面性问题关闭集合
     */
    public List<ComprehensiveDetailDaily> selectComprehensiveDetailDailyList(ComprehensiveDetailDaily comprehensiveDetailDaily);

    /**
     * 新增全面性问题关闭
     *
     * @param comprehensiveDetailDaily 全面性问题关闭
     * @return 结果
     */
    public int insertComprehensiveDetailDaily(ComprehensiveDetailDaily comprehensiveDetailDaily);

    /**
     * 修改全面性问题关闭
     *
     * @param comprehensiveDetailDaily 全面性问题关闭
     * @return 结果
     */
    public int updateComprehensiveDetailDaily(ComprehensiveDetailDaily comprehensiveDetailDaily);

    /**
     * 批量删除全面性问题关闭
     *
     * @param ids 需要删除的全面性问题关闭主键集合
     * @return 结果
     */
    public int deleteComprehensiveDetailDailyByIds(String[] ids);

    /**
     * 批量关闭全面性问题
     *
     * @param ids 需要关闭的全面性问题主键集合
     * @return 结果
     */
    public int closeComprehensiveDetailDailyByIds(String[] ids);

    /**
     * 删除全面性问题关闭信息
     *
     * @param id 全面性问题关闭主键
     * @return 结果
     */
    public int deleteComprehensiveDetailDailyById(String id);
}
