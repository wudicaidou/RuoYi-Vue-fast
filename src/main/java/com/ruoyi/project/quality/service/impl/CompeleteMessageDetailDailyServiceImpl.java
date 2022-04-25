package com.ruoyi.project.quality.service.impl;

import java.util.List;

import com.ruoyi.framework.aspectj.lang.annotation.DataSource;
import com.ruoyi.framework.aspectj.lang.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.quality.mapper.CompeleteMessageDetailDailyMapper;
import com.ruoyi.project.quality.domain.CompeleteMessageDetailDaily;
import com.ruoyi.project.quality.service.ICompeleteMessageDetailDailyService;

/**
 * 公开信息完整性问题关闭Service业务层处理
 *
 * @author cai
 * @date 2022-04-25
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class CompeleteMessageDetailDailyServiceImpl implements ICompeleteMessageDetailDailyService {
    @Autowired
    private CompeleteMessageDetailDailyMapper compeleteMessageDetailDailyMapper;

    /**
     * 查询公开信息完整性问题关闭
     *
     * @param id 公开信息完整性问题关闭主键
     * @return 公开信息完整性问题关闭
     */
    @Override
    public CompeleteMessageDetailDaily selectCompeleteMessageDetailDailyById(String id) {
        return compeleteMessageDetailDailyMapper.selectCompeleteMessageDetailDailyById(id);
    }

    /**
     * 查询公开信息完整性问题关闭列表
     *
     * @param compeleteMessageDetailDaily 公开信息完整性问题关闭
     * @return 公开信息完整性问题关闭
     */
    @Override
    public List<CompeleteMessageDetailDaily> selectCompeleteMessageDetailDailyList(CompeleteMessageDetailDaily compeleteMessageDetailDaily) {
        return compeleteMessageDetailDailyMapper.selectCompeleteMessageDetailDailyList(compeleteMessageDetailDaily);
    }

    /**
     * 新增公开信息完整性问题关闭
     *
     * @param compeleteMessageDetailDaily 公开信息完整性问题关闭
     * @return 结果
     */
    @Override
    public int insertCompeleteMessageDetailDaily(CompeleteMessageDetailDaily compeleteMessageDetailDaily) {
        return compeleteMessageDetailDailyMapper.insertCompeleteMessageDetailDaily(compeleteMessageDetailDaily);
    }

    /**
     * 修改公开信息完整性问题关闭
     *
     * @param compeleteMessageDetailDaily 公开信息完整性问题关闭
     * @return 结果
     */
    @Override
    public int updateCompeleteMessageDetailDaily(CompeleteMessageDetailDaily compeleteMessageDetailDaily) {
        return compeleteMessageDetailDailyMapper.updateCompeleteMessageDetailDaily(compeleteMessageDetailDaily);
    }

    /**
     * 批量删除公开信息完整性问题关闭
     *
     * @param ids 需要删除的公开信息完整性问题关闭主键
     * @return 结果
     */
    @Override
    public int deleteCompeleteMessageDetailDailyByIds(String[] ids) {
        return compeleteMessageDetailDailyMapper.deleteCompeleteMessageDetailDailyByIds(ids);
    }

    /**
     * 删除公开信息完整性问题关闭信息
     *
     * @param id 公开信息完整性问题关闭主键
     * @return 结果
     */
    @Override
    public int deleteCompeleteMessageDetailDailyById(String id) {
        return compeleteMessageDetailDailyMapper.deleteCompeleteMessageDetailDailyById(id);
    }
}
