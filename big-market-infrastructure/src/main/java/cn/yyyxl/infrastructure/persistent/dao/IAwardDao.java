package cn.yyyxl.infrastructure.persistent.dao;


import cn.yyyxl.infrastructure.persistent.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: yyyxl
 * @Description: 奖品表 DAO
 * @DateTime: 2024/3/4 17:01
 **/
@Mapper
public interface IAwardDao {

    List<Award> queryAwardList();

}
