package cn.yyyxl.domain.strategy.service.armory;

/**
 * @Author: yyyxl
 * @Description: TODO
 * @DateTime: 2024/3/6 10:41
 **/
public interface IStrategyDispatch {

    /**
     * 获取抽奖策略装配的随机结果
     *
     * @param strategyId 策略ID
     * @return 抽奖结果
     */
    Integer getRandomAwardId(Long strategyId);
    Integer getRandomAwardId(Long strategyId, String ruleWeightValue);
}
