package com.ruoyi.project.quality.service.impl;

import java.util.List;

import com.ruoyi.common.utils.uuid.IdGenerator;
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
public class GovernanceProjectBlackListServiceImpl implements IGovernanceProjectBlackListService {
    @Autowired
    private GovernanceProjectBlackListMapper governanceProjectBlackListMapper;

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
}
