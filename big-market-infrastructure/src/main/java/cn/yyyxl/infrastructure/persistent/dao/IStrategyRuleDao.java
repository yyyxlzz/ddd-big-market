package cn.yyyxl.infrastructure.persistent.dao;

import cn.yyyxl.infrastructure.persistent.po.StrategyAward;
import cn.yyyxl.infrastructure.persistent.po.StrategyRule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: yyyxl
 * @Description: 策略规则 DAO
 * @DateTime: 2024/3/4 17:04
 **/
@Mapper
public interface IStrategyRuleDao {

    List<StrategyRule> queryStrategyRuleList();

}
