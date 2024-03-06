package cn.yyyxl.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: yyyxl
 * @Description: TODO
 * @DateTime: 2024/3/6 10:51
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AwardEntity {

    /** 用户ID */
    private String userId;
    /** 奖品ID */
    private Integer awardId;

}
