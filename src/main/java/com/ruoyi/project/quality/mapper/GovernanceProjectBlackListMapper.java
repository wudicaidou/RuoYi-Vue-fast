package com.ruoyi.project.quality.mapper;

import java.util.List;

import com.ruoyi.project.quality.domain.GovernanceProjectBlackList;

/**
 * 测试数据黑名单Mapper接口
 *
 * @author cai
 * @date 2022-03-24
 */
public interface GovernanceProjectBlackListMapper {
    /**
     * 查询测试数据黑名单
     *
     * @param id 测试数据黑名单主键
     * @return 测试数据黑名单
     */
    public GovernanceProjectBlackList selectGovernanceProjectBlackListById(String id);

    /**
     * 查询测试数据黑名单列表
     *
     * @param governanceProjectBlackList 测试数据黑名单
     * @return 测试数据黑名单集合
     */
    public List<GovernanceProjectBlackList> selectGovernanceProjectBlackListList(GovernanceProjectBlackList governanceProjectBlackList);

    /**
     * 新增测试数据黑名单
     *
     * @param governanceProjectBlackList 测试数据黑名单
     * @return 结果
     */
    public int insertGovernanceProjectBlackList(GovernanceProjectBlackList governanceProjectBlackList);

    /**
     * 修改测试数据黑名单
     *
     * @param governanceProjectBlackList 测试数据黑名单
     * @return 结果
     */
    public int updateGovernanceProjectBlackList(GovernanceProjectBlackList governanceProjectBlackList);

    /**
     * 删除测试数据黑名单
     *
     * @param id 测试数据黑名单主键
     * @return 结果
     */
    public int deleteGovernanceProjectBlackListById(String id);

    /**
     * 批量删除测试数据黑名单
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGovernanceProjectBlackListByIds(String[] ids);
}
