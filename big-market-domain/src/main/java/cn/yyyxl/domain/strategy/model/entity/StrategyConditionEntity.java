package cn.yyyxl.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: yyyxl
 * @Description: TODO
 * @DateTime: 2024/3/6 10:52
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyConditionEntity {

    /** 用户ID */
    private String userId;
    /** 策略ID */
    private Integer strategyId;


}
