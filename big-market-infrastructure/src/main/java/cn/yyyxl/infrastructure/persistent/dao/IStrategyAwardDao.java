package cn.yyyxl.infrastructure.persistent.dao;

import cn.yyyxl.infrastructure.persistent.po.StrategyAward;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: yyyxl
 * @Description: 抽奖策略奖品明细配置 - 概率 规则 DAO
 * @DateTime: 2024/3/4 17:03
 **/
@Mapper
public interface IStrategyAwardDao {

    List<StrategyAward> queryStrategyAwardList();

    List<StrategyAward> queryStrategyAwardListByStrategyId(Long strategyId);
}
