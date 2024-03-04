package cn.yyyxl.infrastructure.persistent.po;

import lombok.Data;

/**
 * @Author: yyyxl
 * @Description: 抽奖策略
 * @DateTime: 2024/3/4 16:15
 **/
@Data
public class Strategy {


    /** 自增ID */
    private Long id;

    /** 抽奖策略ID */
    private Long strategyId;

    /** 抽奖策略描述 */
    private String strategyDesc;

    /** 规则模型，rule配置的模型同步到此表，便于使用 */
    private String ruleModels;

    /** 创建时间 */
    private String createTime;

    /** 更新时间 */
    private String updateTime;

}
