package cn.yyyxl.domain.strategy.repository;

import cn.yyyxl.domain.strategy.model.StrategyAwardEntity;

import java.util.List;
import java.util.Map;

/**
 * @Author: yyyxl
 * @Description: 策略仓储接口
 * @DateTime: 2024/3/5 16:26
 **/

public interface IStrategyRepository {


    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(Long strategyId, Integer rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);

    Integer getStrategyAwardAssemble(Long strategyId, Integer rateKey);

    int getRateRange(Long strategyId);

}
