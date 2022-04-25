package com.ruoyi.project.quality.service.impl;

import java.util.List;

import com.ruoyi.framework.aspectj.lang.annotation.DataSource;
import com.ruoyi.framework.aspectj.lang.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.quality.mapper.ComprehensiveDetailDailyMapper;
import com.ruoyi.project.quality.domain.ComprehensiveDetailDaily;
import com.ruoyi.project.quality.service.IComprehensiveDetailDailyService;

/**
 * 全面性问题关闭Service业务层处理
 *
 * @author cai
 * @date 2022-04-25
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class ComprehensiveDetailDailyServiceImpl implements IComprehensiveDetailDailyService {
    @Autowired
    private ComprehensiveDetailDailyMapper comprehensiveDetailDailyMapper;

    /**
     * 查询全面性问题关闭
     *
     * @param id 全面性问题关闭主键
     * @return 全面性问题关闭
     */
    @Override
    public ComprehensiveDetailDaily selectComprehensiveDetailDailyById(String id) {
        return comprehensiveDetailDailyMapper.selectComprehensiveDetailDailyById(id);
    }

    /**
     * 查询全面性问题关闭列表
     *
     * @param comprehensiveDetailDaily 全面性问题关闭
     * @return 全面性问题关闭
     */
    @Override
    public List<ComprehensiveDetailDaily> selectComprehensiveDetailDailyList(ComprehensiveDetailDaily comprehensiveDetailDaily) {
        return comprehensiveDetailDailyMapper.selectComprehensiveDetailDailyList(comprehensiveDetailDaily);
    }

    /**
     * 新增全面性问题关闭
     *
     * @param comprehensiveDetailDaily 全面性问题关闭
     * @return 结果
     */
    @Override
    public int insertComprehensiveDetailDaily(ComprehensiveDetailDaily comprehensiveDetailDaily) {
        return comprehensiveDetailDailyMapper.insertComprehensiveDetailDaily(comprehensiveDetailDaily);
    }

    /**
     * 修改全面性问题关闭
     *
     * @param comprehensiveDetailDaily 全面性问题关闭
     * @return 结果
     */
    @Override
    public int updateComprehensiveDetailDaily(ComprehensiveDetailDaily comprehensiveDetailDaily) {
        return comprehensiveDetailDailyMapper.updateComprehensiveDetailDaily(comprehensiveDetailDaily);
    }

    /**
     * 批量删除全面性问题关闭
     *
     * @param ids 需要删除的全面性问题关闭主键
     * @return 结果
     */
    @Override
    public int deleteComprehensiveDetailDailyByIds(String[] ids) {
        return comprehensiveDetailDailyMapper.deleteComprehensiveDetailDailyByIds(ids);
    }

    /**
     * 批量关闭全面性问题
     *
     * @param ids 需要关闭的全面性问题主键
     * @return 结果
     */
    @Override
    public int closeComprehensiveDetailDailyByIds(String[] ids) {
        return comprehensiveDetailDailyMapper.closeComprehensiveDetailDailyByIds(ids);
    }

    /**
     * 删除全面性问题关闭信息
     *
     * @param id 全面性问题关闭主键
     * @return 结果
     */
    @Override
    public int deleteComprehensiveDetailDailyById(String id) {
        return comprehensiveDetailDailyMapper.deleteComprehensiveDetailDailyById(id);
    }
}
