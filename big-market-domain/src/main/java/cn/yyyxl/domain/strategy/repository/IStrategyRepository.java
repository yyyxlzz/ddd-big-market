package cn.yyyxl.domain.strategy.repository;

import cn.yyyxl.domain.strategy.model.entity.StrategyAwardEntity;
import cn.yyyxl.domain.strategy.model.entity.StrategyEntity;
import cn.yyyxl.domain.strategy.model.entity.StrategyRuleEntity;

import java.util.List;
import java.util.Map;

/**
 * @Author: yyyxl
 * @Description: 策略仓储接口
 * @DateTime: 2024/3/5 16:26
 **/

public interface IStrategyRepository {

    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(String key, Integer rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);

    Integer getStrategyAwardAssemble(String key, Integer rateKey);

    int getRateRange(Long strategyId);

    int getRateRange(String key);

    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleModel);

}
